package io.github.ololx.cranberry.examples;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * project cranberry-examples
 * created 2022-01-13 13:04
 *
 * @author Alexander A. Kropotin
 */
public class FinalExamplesPositiveITest extends FinalExamplesTest {

    @BeforeTest
    public void beforeTest() {
        finalExamples = new FinalExamples();
    }

    @Test(dataProvider = "numbers")
    public void finalLocalVariableExample_whenInitializeLocalVariableByIntegers_thenTheirSumIsCalculatedAsUsual(Integer expectedNumbersSummary, Integer[] numberSequence) {
        log.info(String.format("Run test with expected numbers summary = %d",   expectedNumbersSummary));
        int actualNumbersSummary = finalExamples.finalLocalVariableExample(numberSequence);
        log.info(String.format("Complete test with actual numbers summary = %d", actualNumbersSummary));

        assertTrue(
                actualNumbersSummary == expectedNumbersSummary,
                "The actual numbers summary is not equals to expected"
        );
    }

    @Test(dataProvider = "numbers")
    public void finalMethodParamExample_whenPutIntegersToFinalParam_thenTheirSumIsCalculatedAsUsual(Integer expectedNumbersSummary, Integer[] numberSequence) {
        log.info(String.format("Run test with expected numbers summary = %d",   expectedNumbersSummary));
        int actualNumbersSummary = finalExamples.finalMethodParamExample(numberSequence);
        log.info(String.format("Complete test with actual numbers summary = %d", actualNumbersSummary));

        assertTrue(
                actualNumbersSummary == expectedNumbersSummary,
                "The actual numbers summary is not equals to expected"
        );
    }
}
