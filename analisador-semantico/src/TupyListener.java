// Generated from Tupy.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TupyParser}.
 */
public interface TupyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TupyParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(TupyParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupyParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(TupyParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupyParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(TupyParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupyParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(TupyParser.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupyParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(TupyParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupyParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(TupyParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupyParser#declaracaoComAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoComAtribuicao(TupyParser.DeclaracaoComAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupyParser#declaracaoComAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoComAtribuicao(TupyParser.DeclaracaoComAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupyParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(TupyParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupyParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(TupyParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupyParser#incrementoOuDecremento}.
	 * @param ctx the parse tree
	 */
	void enterIncrementoOuDecremento(TupyParser.IncrementoOuDecrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupyParser#incrementoOuDecremento}.
	 * @param ctx the parse tree
	 */
	void exitIncrementoOuDecremento(TupyParser.IncrementoOuDecrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupyParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFuncao(TupyParser.ChamadaFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupyParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFuncao(TupyParser.ChamadaFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupyParser#escrita}.
	 * @param ctx the parse tree
	 */
	void enterEscrita(TupyParser.EscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupyParser#escrita}.
	 * @param ctx the parse tree
	 */
	void exitEscrita(TupyParser.EscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupyParser#leitura}.
	 * @param ctx the parse tree
	 */
	void enterLeitura(TupyParser.LeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupyParser#leitura}.
	 * @param ctx the parse tree
	 */
	void exitLeitura(TupyParser.LeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupyParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(TupyParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupyParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(TupyParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupyParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(TupyParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupyParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(TupyParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupyParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(TupyParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupyParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(TupyParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupyParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(TupyParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupyParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(TupyParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupyParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(TupyParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupyParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(TupyParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupyParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(TupyParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupyParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(TupyParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupyParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(TupyParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupyParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(TupyParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupyParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(TupyParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupyParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(TupyParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupyParser#parametrosDef}.
	 * @param ctx the parse tree
	 */
	void enterParametrosDef(TupyParser.ParametrosDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupyParser#parametrosDef}.
	 * @param ctx the parse tree
	 */
	void exitParametrosDef(TupyParser.ParametrosDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupyParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(TupyParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupyParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(TupyParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link TupyParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(TupyParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TupyParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(TupyParser.BlocoContext ctx);
}