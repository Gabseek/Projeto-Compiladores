import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import org.antlr.v4.runtime.Token;

public class MyListener extends TupyBaseListener {

    // Pilha de escopos: cada escopo é uma tabela de símbolos (mapa de variável -> tipo)
    private Stack<Map<String, String>> escopos = new Stack<>();
    private String tipoElemento = null;

    // Construtor: cria o escopo global
    public MyListener() {
        escopos.push(new HashMap<>());
    }

    // Ao entrar em um bloco, cria um novo escopo
    @Override
    public void enterBloco(TupyParser.BlocoContext ctx) {
        escopos.push(new HashMap<>());
    }

    // Ao sair de um bloco, descarta o escopo atual
    @Override
    public void exitBloco(TupyParser.BlocoContext ctx) {
        escopos.pop();
    }

    @Override
    public void exitInstrucao(TupyParser.InstrucaoContext ctx) {
        System.out.println("Instrução: " + ctx.getText());

        // Caso seja uma declaração com atribuição: TIPO ID OPATRIB expressao FLINHA;
        if (ctx.declaracaoComAtribuicao() != null) {
            String id = ctx.declaracaoComAtribuicao().ID().getText();
            String tipo = ctx.declaracaoComAtribuicao().TIPO().getText();
            if (!verificarVarDuplicacao(id, ctx.start)) {
                if (!verificarTipoIncompativelExpressao(id, tipo, ctx.start)) {
                    getEscopoAtual().put(id, tipo);
                }
            }
        }
        // Caso seja uma declaração sem atribuição: TIPO ID FLINHA;
        else if (ctx.declaracao() != null) {
            String id = ctx.declaracao().ID().getText();
            String tipo = ctx.declaracao().TIPO().getText();
            if (!verificarVarDuplicacao(id, ctx.start)) {
                getEscopoAtual().put(id, tipo);
            }
        }
        // Caso seja uma atribuição: ID OPATRIB expressao FLINHA;
        else if (ctx.atribuicao() != null) {
            String id = ctx.atribuicao().ID().getText();
            if (!verificarVarNaoDeclarada(id, ctx.start)) {
                verificarTipoIncompativelExpressao(id, null, ctx.start);
            }
        }
        // Caso seja um incremento/decremento: ID OPINCDEC FLINHA;
        else if (ctx.incrementoOuDecremento() != null) {
            String id = ctx.incrementoOuDecremento().ID().getText();
            if (!verificarVarNaoDeclarada(id, ctx.start)) {
                verificarTipoIncompativelOpIncDec(id, ctx.start);
            }
        }
        // Caso seja uma leitura: LEITURA ID FLINHA;
        else if (ctx.leitura() != null) {
            String id = ctx.leitura().ID().getText();
            if (!verificarVarNaoDeclarada(id, ctx.start)) {
                verificarTipoIncompativelTexto(id, ctx.start);
            }
        }
        // Outros casos (chamada de função, escrita, retorno, etc.) podem ser tratados conforme necessário.

        // Reinicia o tipoElemento após processar a instrução
        tipoElemento = null;
    }

    @Override
    public void enterExpressao(TupyParser.ExpressaoContext ctx) {
        // Caso a expressão seja simples (apenas um termo)
        if (ctx.termo() != null && ctx.getChildCount() == 1) {
            if (tipoElemento == null) {
                tipoElemento = verificarTipoTermo(ctx.termo());
            } else if (!tipoElemento.equals("indefinido")) {
                tipoElemento = verificarTipoTermo(ctx.termo());
            }
        }
        // Expressão com operação aritmética: expressao OPMAT expressao
        else if (ctx.OPMAT() != null && ctx.getChildCount() == 3) {
            String tipo1 = "indefinido";
            String tipo2 = "indefinido";
            if (ctx.expressao(0) != null && ctx.expressao(0).termo() != null) {
                tipo1 = verificarTipoTermo(ctx.expressao(0).termo());
            }
            if (ctx.expressao(1) != null && ctx.expressao(1).termo() != null) {
                tipo2 = verificarTipoTermo(ctx.expressao(1).termo());
            }
            if (!tipo1.equals("indefinido") && tipo2.equals("indefinido")) {
                tipoElemento = tipo1;
            } else if (tipo1.equals("indefinido") && !tipo2.equals("indefinido")) {
                tipoElemento = tipo2;
            } else if (!tipo1.equals(tipo2)) {
                tipoElemento = "indefinido";
            } else {
                tipoElemento = tipo1;
            }
        }
        // Expressão parentizada: AP expressao FP
        else if (ctx.getChildCount() == 3
                && ctx.getChild(0).getText().equals("(")
                && ctx.getChild(2).getText().equals(")")) {
            // A expressão interna já será processada.
        }
    }

    // Verifica o tipo de um termo (equivalente à antiga função verificarTipoElemento)
    private String verificarTipoTermo(TupyParser.TermoContext ctx) {
        if (ctx.NUMINT() != null) {
            return "int";
        } else if (ctx.NUMREAL() != null) {
            return "real";
        } else if (ctx.Str() != null) {
            return "lin";
        } else if (ctx.ID() != null) {
            String id = ctx.ID().getText();
            if (verificarVarNaoDeclarada(id, ctx.start)) {
                return "indefinido";
            } else {
                return getTipoVariavel(id);
            }
        }
        return "indefinido";
    }

    // Checagem de variável duplicada (somente no escopo atual)
    private boolean verificarVarDuplicacao(String id, Token start) {
        if (getEscopoAtual().containsKey(id)) {
            System.out.println("Declaração duplicada! Variável " + id + " já foi declarada neste escopo!");
            imprimirErro(start);
            return true;
        } else {
            return false;
        }
    }

    // Checagem de variável não declarada (procura em todos os escopos)
    private boolean verificarVarNaoDeclarada(String id, Token start) {
        if (getTipoVariavel(id) == null) {
            System.out.println("Variável " + id + " não foi declarada!");
            imprimirErro(start);
            return true;
        } else {
            return false;
        }
    }

    // Checagem de tipos incompatíveis na atribuição/expressão
    private boolean verificarTipoIncompativelExpressao(String id, String tipo, Token start) {
        if (tipo == null) {
            tipo = getTipoVariavel(id);
        }
        if (!tipo.equals(tipoElemento)) {
            imprimirTipo(id, tipo);
            System.out.println("\tTipo da expressão: " + tipoElemento);
            imprimirErro(start);
            return true;
        } else {
            return false;
        }
    }

    // Checagem de tipos incompatíveis para incremento/decremento
    private void verificarTipoIncompativelOpIncDec(String id, Token start) {
        String tipo = getTipoVariavel(id);
        if (!tipo.equals("int") && !tipo.equals("real")) {
            imprimirTipo(id, tipo);
            System.out.println("\tTipo esperado: int ou real");
            imprimirErro(start);
        }
    }

    // Checagem de tipos incompatíveis para operações de leitura (texto)
    private void verificarTipoIncompativelTexto(String id, Token start) {
        String tipo = getTipoVariavel(id);
        if (!tipo.equals("lin")) {
            imprimirTipo(id, tipo);
            System.out.println("\tTipo esperado: lin");
            imprimirErro(start);
        }
    }

    // Função auxiliar para imprimir mensagens de tipos incompatíveis
    private void imprimirTipo(String id, String tipo) {
        System.out.println("Tipo incompatível para a variável/valor: " + id);
        System.out.println("\tTipo de " + id + ": " + tipo);
    }

    // Função auxiliar para imprimir informações de erro (linha e posições)
    private void imprimirErro(Token start) {
        System.out.println("\tLinha: " + start.getLine());
        System.out.println("\tPos Inicial: " + start.getStartIndex());
        System.out.println("\tPos Final: " + start.getStopIndex());
    }

    // Retorna o escopo atual (topo da pilha)
    private Map<String, String> getEscopoAtual() {
        return escopos.peek();
    }

    // Procura pelo tipo de uma variável em todos os escopos (do mais interno para o mais externo)
    private String getTipoVariavel(String id) {
        for (int i = escopos.size() - 1; i >= 0; i--) {
            if (escopos.get(i).containsKey(id)) {
                return escopos.get(i).get(id);
            }
        }
        return null;
    }

    // Retorna o escopo global (primeiro da pilha)
    public Map<String, String> getTabelaSimbolos() {
        return escopos.firstElement();
    }
}
