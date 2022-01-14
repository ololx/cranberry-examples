package io.github.ololx.cranberry.examples;

import io.github.ololx.cranberry.data.modifier.annotation.Final;

import java.util.Arrays;
import java.util.List;

/**
 * project cranberry-examples
 * created 2022-01-11 18:29
 *
 * @author Alexander A. Kropotin
 */
public final class FinalExamples {

    /**
     * Final local variable example int.
     *
     * @param numbers the numbers
     * @return the int
     */
    public int finalLocalVariableExample(Integer... numbers) {
        @Final
        List<Integer> finalLocalVariable = List.of(numbers == null ? new Integer[0] : numbers);

        return finalLocalVariable.stream().reduce(Integer::sum).orElse(0);
    }

    /**
     * Final method param example int.
     *
     * @param finalMethodParam the final method param
     * @return the int
     */
    public int finalMethodParamExample(@Final Integer... finalMethodParam) {
        return Arrays.stream(finalMethodParam == null ? new Integer[0] : finalMethodParam)
                .reduce(Integer::sum).orElse(0);
    }
}
