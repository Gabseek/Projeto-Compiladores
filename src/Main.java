import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String filename = "C:\\codigos\\Fatorial.txt";
        try{
            CharStream input = CharStreams.fromFileName(filename);
            TupyLexer lexer = new TupyLexer(input);
            Token token;
            while (!lexer._hitEOF){
                token = lexer.nextToken();
                System.out.println("Token: <Classe: "+lexer.getVocabulary().getSymbolicName(token.getType()) +" ,Lexema: "+ token.getText() +">");
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

