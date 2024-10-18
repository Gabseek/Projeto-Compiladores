import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String filename = "C:\\codigos\\Fatorial (Com erros).txt";  

        try {
            CharStream input = CharStreams.fromFileName(filename);
            TupyLexer lexer = new TupyLexer(input); 
            Token token;

            while ((token = lexer.nextToken()).getType() != Token.EOF) {
                String tokenType = lexer.getVocabulary().getSymbolicName(token.getType());

                if (tokenType == null || tokenType.isEmpty()) {
                    System.err.println("Erro: Token inválido na linha " + token.getLine() + " com lexema: \"" + token.getText() + "\"");
                } else {
                    System.out.println("Token: <Classe: " + tokenType + " ,Lexema: " + token.getText() + ">");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
