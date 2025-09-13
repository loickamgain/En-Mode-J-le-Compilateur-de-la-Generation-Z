package be.unamur.info.b314.compiler.main;

import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import java.util.ArrayList;
import java.util.List;

/**
 *  @author James Ortiz - james.ortizvega@unamur.be
 */
public class MyConsoleErrorListener extends ConsoleErrorListener {

    private boolean errorReported;
    private final List<String> errors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        errorReported = true;

        String errorMessage = "line " + line + ":" + charPositionInLine + " " + msg;
        errors.add(errorMessage); // Ajouter l'erreur dans la liste
        System.err.println(errorMessage + "\n" + e + "\n" + offendingSymbol);
    }

    public boolean errorHasBeenReported() {
        return errorReported;
    }

    public String getErrorsString() {
        return String.join("\n", errors);
    }
}
