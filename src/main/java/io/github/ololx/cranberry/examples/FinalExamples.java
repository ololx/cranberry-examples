package io.github.ololx.cranberry.examples;

import io.github.ololx.cranberry.data.modifier.annotation.Final;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * project cranberry-examples
 * created 2022-01-11 18:29
 *
 * @author Alexander A. Kropotin
 */
public final class FinalExamples {

    public int finalLocalVariableExample(Integer... numbers) {
        @Final
        List<Integer> finalLocalVariable = List.of(numbers == null ? new Integer[0] : numbers);

        return finalLocalVariable.stream().reduce(Integer::sum).orElse(0);
    }

    public int finalMethodParamExample(@Final Integer... finalMethodParam) {
        return Arrays.stream(finalMethodParam == null ? new Integer[0] : finalMethodParam)
                .reduce(Integer::sum).orElse(0);
    }
}
