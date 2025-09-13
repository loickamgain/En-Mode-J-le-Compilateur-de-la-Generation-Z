package be.unamur.info.b314.compiler.main;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URISyntaxException;

import static org.hamcrest.Matchers.endsWith;
import static org.junit.Assert.assertThat;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import be.unamur.info.b314.compiler.EMJLexer;
import be.unamur.info.b314.compiler.EMJParser;
import be.unamur.info.b314.compiler.emj.EMJVisitor;
import be.unamur.info.b314.compiler.emj.EMJCodeGenerator;
import java.nio.file.Files;
import static org.junit.Assert.fail;


/**
 * Compilation helper for testing the EMJ compiler
 */
class CompilerTestHelper {

    /**
     * Launch compilation and return compiler output (stdout + stderr).
     *
     * @param input      The name of the input file (path inside src/test/resources).
     * @param outputFile Temporary output file to store generated code.
     * @param expectedOK True if the compiler should print 'OK', false if 'KO' is expected.
     * @param message    Message for assertion failure.
     * @return Full output of the compiler (stdout + stderr).
     */
    public static String launchCompilation(String input, File outputFile, boolean expectedOK, String message)
            throws URISyntaxException, IOException {

        // Local file path to resource input
        File inputFile = new File(CompilerTestHelper.class.getResource(input).toURI());

        // Setup capture of stdout and stderr
        ByteArrayOutputStream stdoutCapture = new ByteArrayOutputStream();
        ByteArrayOutputStream stderrCapture = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        PrintStream originalErr = System.err;

        System.setOut(new PrintStream(stdoutCapture));
        System.setErr(new PrintStream(stderrCapture));

        try {
            // Run the main compiler
            Main.main(new String[]{"-i", inputFile.getAbsolutePath(), "-o", outputFile.getAbsolutePath()});
        } finally {
            // Restore original streams
            System.setOut(originalOut);
            System.setErr(originalErr);
        }

        // Combine output
        String output = stdoutCapture.toString() + stderrCapture.toString();
        String expectedEnding = expectedOK ? "OK\n" : "KO\n";

        // Assertion
        assertThat(message, output.trim(), endsWith(expectedEnding.trim()));

        return output;
    }

    public static String launchCompilationWithCodeGeneration(String input, File outputFile, boolean expectedOK, String message)
            throws URISyntaxException, IOException {

        // Lecture du fichier EMJ source
        CharStream inputCharStream = CharStreams.fromStream(CompilerTestHelper.class.getResourceAsStream(input));

        // Étape 1: Lexer & Parser
        EMJLexer lexer = new EMJLexer(inputCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EMJParser parser = new EMJParser(tokens);
        EMJParser.RootContext tree = parser.root();

        // Vérification syntaxique
        if (parser.getNumberOfSyntaxErrors() > 0 && expectedOK) {
            fail("Erreur syntaxique inattendue dans le test : " + message);
        }

        // Étape 2: Analyse sémantique
        EMJVisitor visitor = new EMJVisitor();
        visitor.visit(tree);

        if (!visitor.getErrorLogger().isEmpty() && expectedOK) {
            fail("Erreur sémantique inattendue dans le test : " + visitor.getErrorLogger());
        }

        // Étape 3: Génération du code Python
        EMJCodeGenerator codeGenerator = new EMJCodeGenerator();
        codeGenerator.visit(tree);
        String pythonCode = codeGenerator.getPythonCode();

        // Écriture du code Python dans le fichier spécifié
        Files.writeString(outputFile.toPath(), pythonCode);

        // Vérification finale OK/KO selon attendu
        String finalResult = visitor.getErrorLogger().isEmpty() ? "OK\n" : "KO\n";
        if (expectedOK && !finalResult.equals("OK\n")) {
            fail("Échec inattendu : " + message);
        } else if (!expectedOK && !finalResult.equals("KO\n")) {
            fail("Réussite inattendue : " + message);
        }

        return pythonCode;
    }

}
