package io.github.cranberry.examples;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static org.testng.Assert.*;

/**
 * project cranberry-examples
 * created 2022-01-12 20:24
 *
 * @author Alexander A. Kropotin
 */
public class FinalExampleTest {

    private static final Logger log = Logger.getLogger(FinalExampleTest.class.getName());

    private static FinalExamples finalExamples;

    @BeforeTest
    public void beforeTest() {
        finalExamples = new FinalExamples();
    }

    @DataProvider(name = "numbers")
    public static Object[][] numbers() {
        int maxNumber = 100;
        Object[][] numbersSequences = new Object[100][2];

        numbersSequences[0][0] = 1;
        numbersSequences[0][1] = new Integer[]{1};

        for (int number = 2; number <= maxNumber; number++) {
            List<Integer> currentNumbersSequence = Arrays.stream((Integer[]) numbersSequences[number - 2][1])
                    .collect(Collectors.toList());
            currentNumbersSequence.add(number);

            numbersSequences[number - 1][0] = ((int) numbersSequences[number - 2][0]) + number;
            numbersSequences[number - 1][1] = currentNumbersSequence.toArray(Integer[]::new);
        }

        return numbersSequences;
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
