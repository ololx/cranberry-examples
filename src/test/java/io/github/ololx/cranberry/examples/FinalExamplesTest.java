package io.github.ololx.cranberry.examples;

import org.testng.annotations.DataProvider;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * project cranberry-examples
 * created 2022-01-12 20:24
 *
 * @author Alexander A. Kropotin
 */
public abstract class FinalExamplesTest {

    protected static final Logger log = Logger.getLogger(FinalExamplesTest.class.getName());

    protected static FinalExamples finalExamples;

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
}
