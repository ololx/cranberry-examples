package io.github.cranberry.examples;

import io.github.ololx.cranberry.data.modifier.annotation.Final;

import java.util.Set;

/**
 * project cranberry-examples
 * created 2022-01-11 18:29
 *
 * @author Alexander A. Kropotin
 */
public class FinalExamples {

    public int finalLocalVariableExample() {
        @Final Set<Integer> finalLocalVariable = Set.of(1, 2, 3, 4);

        return finalLocalVariable.stream().reduce(Integer::sum).orElse(0);
    }

    public int finalMethodParamExample(@Final Set<Integer> finalMethodParam) {
        return finalMethodParam.stream().reduce(Integer::sum).orElse(0);
    }
}
