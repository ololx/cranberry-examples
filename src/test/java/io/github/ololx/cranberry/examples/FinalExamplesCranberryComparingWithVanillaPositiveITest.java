package io.github.ololx.cranberry.examples;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertTrue;

/**
 * project cranberry-examples
 * created 2022-01-13 13:04
 *
 * @author Alexander A. Kropotin
 */
public class FinalExamplesCranberryComparingWithVanillaPositiveITest extends FinalExamplesTest {

    public final class VanillaFinalInstance {

        public int finalLocalVariableExample(Integer... numbers) {
            final List<Integer> finalLocalVariable = List.of(numbers == null ? new Integer[0] : numbers);

            return finalLocalVariable.stream().reduce(Integer::sum).orElse(0);
        }

        public int finalMethodParamExample(final Integer... finalMethodParam) {
            return Arrays.stream(finalMethodParam == null ? new Integer[0] : finalMethodParam)
                    .reduce(Integer::sum).orElse(0);
        }
    }

    private static VanillaFinalInstance vanillaFinal;

    @BeforeTest
    public void beforeTest() {
        finalExamples = new FinalExamples();
        vanillaFinal = new VanillaFinalInstance();
    }

    @Test(dataProvider = "numbers")
    public void finalLocalVariableExample_whenInitializeLocalVariableByIntegers_thenTheirSumIsCalculatedForCranberryAndVanillaAreSame(Integer expectedNumbersSummary, Integer[] numberSequence) {
        log.info(String.format("Run test with expected numbers summary = %d",   expectedNumbersSummary));
        int cranberryActualNumbersSummary = finalExamples.finalLocalVariableExample(numberSequence);
        int vanillaActualNumbersSummary = vanillaFinal.finalLocalVariableExample(numberSequence);
        log.info(String.format(
                "Complete test with Cranberry actual numbers summary = %d and Vanilla actual numbers summary = %d",
                cranberryActualNumbersSummary,
                vanillaActualNumbersSummary
        ));

        assertTrue(
                cranberryActualNumbersSummary == expectedNumbersSummary,
                "The Cranberry actual numbers summary is not equals to expected"
        );

        assertTrue(
                vanillaActualNumbersSummary == expectedNumbersSummary,
                "The vanilla actual numbers summary is not equals to expected"
        );

        assertTrue(
                vanillaActualNumbersSummary == cranberryActualNumbersSummary,
                "The vanilla actual numbers summary and the cranberry actual numbers summary are different"
        );
    }

    @Test(dataProvider = "numbers")
    public void finalMethodParamExample_whenPutIntegersToFinalParam_thenTheirSumIsCalculatedForCranberryAndVanillaAreSame(Integer expectedNumbersSummary, Integer[] numberSequence) {
        log.info(String.format("Run test with expected numbers summary = %d",   expectedNumbersSummary));
        int cranberryActualNumbersSummary = finalExamples.finalMethodParamExample(numberSequence);
        int vanillaActualNumbersSummary = vanillaFinal.finalMethodParamExample(numberSequence);
        log.info(String.format(
                "Complete test with Cranberry actual numbers summary = %d and Vanilla actual numbers summary = %d",
                cranberryActualNumbersSummary,
                vanillaActualNumbersSummary
        ));

        assertTrue(
                cranberryActualNumbersSummary == expectedNumbersSummary,
                "The Cranberry actual numbers summary is not equals to expected"
        );

        assertTrue(
                vanillaActualNumbersSummary == expectedNumbersSummary,
                "The vanilla actual numbers summary is not equals to expected"
        );

        assertTrue(
                vanillaActualNumbersSummary == cranberryActualNumbersSummary,
                "The vanilla actual numbers summary and the cranberry actual numbers summary are different"
        );
    }
}
