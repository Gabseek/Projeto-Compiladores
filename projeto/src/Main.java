import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String filename = "C:\\Users\\Pichau\\Desktop\\Faculdade\\7 - período\\Compiladores\\Trabalho\\PT2\\Analisador-Lexico-main (1)\\Analisador-Lexico-main\\codigos\\MDC.txt";

        try {
            CharStream input = CharStreams.fromFileName(filename);
            TupyLexer lexer = new TupyLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TupyParser parser = new TupyParser(tokens);

            ParseTree ast = parser.programa();

            System.out.println(ast.toStringTree());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
