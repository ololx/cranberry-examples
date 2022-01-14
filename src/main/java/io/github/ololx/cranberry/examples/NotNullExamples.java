package io.github.ololx.cranberry.examples;

import io.github.ololx.cranberry.statement.annotation.NotNull;

/**
 * project cranberry-examples
 * created 2022-01-13 18:19
 *
 * @author Alexander A. Kropotin
 */
public final class NotNullExamples {

    /**
     * Not null local variable example int.
     *
     * @param number the number
     * @return the int
     */
    public int notNullLocalVariableExample(Integer number) {
        @NotNull
        Integer notNullLocalVariable = number;

        return notNullLocalVariable;
    }

    /**
     * Not null method param example int.
     *
     * @param notNullMethodParam the not null method param
     * @return the int
     */
    public int notNullMethodParamExample(@NotNull Integer notNullMethodParam) {
        return notNullMethodParam;
    }
}
