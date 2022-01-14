package io.github.ololx.cranberry.examples;

import io.github.ololx.cranberry.statement.annotation.NotNull;

/**
 * project cranberry-examples
 * created 2022-01-13 18:19
 *
 * @author Alexander A. Kropotin
 */
public final class NotNullExamples {

    public int notNullLocalVariableExample(Integer number) {
        @NotNull
        Integer notNullLocalVariable = number;

        return notNullLocalVariable;
    }

    public int notNullMethodParamExample(@NotNull Integer notNullMethodParam) {
        return notNullMethodParam;
    }
}
