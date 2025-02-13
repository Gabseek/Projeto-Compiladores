import java.io.IOException;
import java.nio.file.NoSuchFileException;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class AnalisadorSemantico {
    public static void main(String[] args) {

        String filename = "insira caminho";

        TupyParser parser = getParser(filename);

        if(parser != null) {
            ParseTree ast = parser.programa();

            MyListener listener = new MyListener();

            ParseTreeWalker walker = new ParseTreeWalker();

            walker.walk(listener, ast);

            System.out.println(listener.getTabelaSimbolos().toString());
        }

    }

    private static TupyParser getParser(String filename) {
        TupyParser parser = null;

        try {
            CharStream input = CharStreams.fromFileName(filename);
            TupyLexer lexer = new TupyLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new TupyParser(tokens);
        }
        catch(NoSuchFileException e) {
            System.out.println("Nome inválido ou não existe!");
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        return parser;
    }
}