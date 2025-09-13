package be.unamur.info.b314.compiler.main;


import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.containsString;
import java.nio.file.Files;








public class EMJDoneTest {

    private static final Logger LOG = LoggerFactory.getLogger(EMJDoneTest.class);

    @Rule
    // Create a temporary folder for outputs deleted after tests
    public TemporaryFolder testFolder = new TemporaryFolder();

    @Rule
    // Print message on logger before each test
    public TestRule watcher = new TestWatcher() {
        @Override
        protected void starting(Description description) {
            LOG.info(String.format("Starting test: %s()...",
                    description.getMethodName()));
        }
        ;
    };

    /* our test for the projet */

    @Test
    public void test_valid_main_ok() throws Exception {
        CompilerTestHelper.launchCompilation(
                "/example/ok/test_valid_main_ok.moj",
                testFolder.newFile(),
                true,
                "Test OK: fonction main vide doit compiler."
        );
    }

    @Test
    public void test_valid_var_decl_ok() throws Exception {
        CompilerTestHelper.launchCompilation(
                "/example/ok/test_valid_var_decl_ok.moj",
                testFolder.newFile(),
                true,
                "Test OK: déclaration et affectation de variables valides."
        );
    }

    @Test
    public void test_invalid_missing_semicolon() throws Exception {
        CompilerTestHelper.launchCompilation(
                "/example/ko/test_invalid_missing_semicolon.moj",
                testFolder.newFile(),
                false,
                "Test KO: oubli du point-virgule après déclaration."
        );
    }



    @Test
    public void test_invalid_missing_main() throws Exception {
        CompilerTestHelper.launchCompilation(
                "/example/ko/test_invalid_missing_main.moj",
                testFolder.newFile(),
                false,
                "Test KO: absence de la fonction main."
        );
    }

    //@Test
    //public void mes_test() throws Exception {
      //  CompilerTestHelper.launchCompilation(
        //        "/example/ko/mes_test.moj",
          //      testFolder.newFile(),
            //    true,
              //  "Test KO: good int "
        //);
    //}

    @Test
    public void test_ko_mathoperation_invalid_operand() throws Exception {
        CompilerTestHelper.launchCompilation(
                "/example/ko/ko_mathoperation_invalid_operand.moj",
                testFolder.newFile(),
                false,
                "Test KO : opération mathématique avec opérandes incompatibles doit échouer."
        );
    }


    @Test
    public void test_ok_mathoperation_valid_tuple_index() throws Exception {
        CompilerTestHelper.launchCompilation(
                "/example/ok/ok_mathoperation_valid_tuple_index.moj",
                testFolder.newFile(),
                true,
                "OK\n"
        );
    }
    @Test
    public void test_ko_mathoperation_invalid_division_by_zero() throws Exception {
        CompilerTestHelper.launchCompilation(
                "/example/ko/test_ko_mathoperation_invalid_division_by_zero.moj",
                testFolder.newFile(),
                false,
                "Test KO : division par zéro doit échouer."
        );
    }

    @Test
    public void test_ko_math_operation_integer_too_small() throws Exception {
        CompilerTestHelper.launchCompilation(
                "/example/ko/test_ko_math_operation_integer_too_small.moj",
                testFolder.newFile(),
                false,
                "Test KO : opération mathématique générant un entier trop petit doit échouer."
        );
    }

    @Test
    public void test_ko_variable_int_value_starts_with_zero() throws Exception {
        CompilerTestHelper.launchCompilation(
                "/example/ko/ko_variable_int_value_starts_with_zero.moj",
                testFolder.newFile(), // <-- argument manquant à ajouter ici
                false,
                "[Test KO - Integer starts with zero] test failed - numbers should not start with zero"
        );
    }

    @Test
    public void test_ok_variable_id_exists_but_different_scope() throws Exception {
        String output = CompilerTestHelper.launchCompilation(
                "/example/ok/ok_variable_id_exists_but_different_scope.moj",
                testFolder.newFile(),
                true,
                "Test OK : Même identifiant dans des scopes différents doit être accepté."
        );

        System.out.println(">>> Résultat compilateur : " + output);
    }

    @Test
    public void test_ok_variable_tuple_valid_affect() throws Exception {
        String output = CompilerTestHelper.launchCompilation(
                "/example/ok/ok_variable_tuple_valid_affect.moj",
                testFolder.newFile(),
                true,
                "[SEMANTIC TEST] test_ok_variable_tuple_valid_affect : accès et affectation valides d'un tuple."
        );

        System.out.println(">>> Résultat compilateur : " + output);
    }


    @Test
    public void test_ok_tuple_string_affectation() throws Exception {
        CompilerTestHelper.launchCompilation(
                "/example/ok/test_ok_tuple_string_affectation.moj",
                testFolder.newFile(),
                true,
                "Test OK : Affectation valide d'une valeur String à un élément tuple-string."
        );
    }

    @Test
    public void test_ko_tuple_string_invalid_affectation() throws Exception {
        CompilerTestHelper.launchCompilation(
                "/example/ko/test_ko_tuple_string_invalid_affectation.moj",
                testFolder.newFile(),
                false,
                "Test KO : Affectation invalide d'un Integer à un élément tuple-string."
        );
    }

    @Test
    public void test_local_func_call_returns_int() throws Exception {
        CompilerTestHelper.launchCompilation(
                "/example/ok/rightexp_func_call_simple.moj",
                testFolder.newFile(),
                true,
                "Test local: L'appel simple de fonction renvoyant un entier doit compiler avec succès."
        );
    }

    @Test
    public void test_ok_parameter_call_valid_function_type() throws Exception {
        File outputFile = testFolder.newFile();

        String output = CompilerTestHelper.launchCompilation(
                "/example/ok/ok_parameter_call_valid_function_type.moj",
                outputFile,
                true,
                "Test OK : appel valide d'une fonction avec les bons types de paramètres et retour."
        );

        System.out.println("[TEST LOG] Output = " + output); // utile temporairement

        assertThat(output.trim(), endsWith("OK"));
    }


    @Test
    public void test() throws Exception {
        // Définir le chemin du fichier EMJ à tester
        String inputFilePath = "/example/ok/test.moj";

        // Créer un fichier temporaire pour stocker le code généré
        File outputPythonFile = testFolder.newFile("output.py");

        // Lancer la compilation/génération
        String output = CompilerTestHelper.launchCompilationWithCodeGeneration(
                inputFilePath,
                outputPythonFile,
                true,
                "Test OK : Génération du code MicroPython depuis fichier EMJ."
        );

        // Lire et afficher le contenu généré pour vérification
        String pythonCodeGenerated = Files.readString(outputPythonFile.toPath());
        System.out.println("### Code MicroPython généré :\n" + pythonCodeGenerated);

        // Optionnel : vérifier la présence d'instructions attendues dans le code généré
        assertThat(pythonCodeGenerated, containsString("def main():"));
        assertThat(pythonCodeGenerated, containsString("cutebot.move_up(2)"));
        assertThat(pythonCodeGenerated, containsString("cutebot.activate_lights()"));
        // 👇 CORRECTION PRÉCISE ICI
        assertThat(pythonCodeGenerated, containsString("if fire > 2:"));

        // vérifie aussi la déclaration de la variable
        assertThat(pythonCodeGenerated, containsString("fire = 5"));
    }


    @Test
    public void mes_test() throws Exception {
        String inputFilePath = "/example/ko/mes_test.moj";
        File outputPythonFile = testFolder.newFile("output_complet.py");

        String pythonCodeGenerated = CompilerTestHelper.launchCompilationWithCodeGeneration(
                inputFilePath,
                outputPythonFile,
                true,
                "Test OK : Génération complète du code MicroPython depuis fichier EMJ complet."
        );

        System.out.println("### Code MicroPython généré :\n" + pythonCodeGenerated);

    }




}
