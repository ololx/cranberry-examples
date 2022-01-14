package io.github.ololx.cranberry.examples;

import io.github.ololx.cranberry.statement.annotation.NotEmpty;

/**
 * project cranberry-examples
 * created 2022-01-14 16:11
 *
 * @author Alexander A. Kropotin
 */
public final class NotEmptyExamples {

    public String notEmptyLocalVariableExample(String number) {
        @NotEmpty
        String notEmptyLocalVariable = number;

        return notEmptyLocalVariable;
    }

    public String notEmptyMethodParamExample(@NotEmpty String notEmptyMethodParam) {
        return notEmptyMethodParam;
    }
}