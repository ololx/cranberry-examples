package io.github.ololx.cranberry.examples;

import io.github.ololx.cranberry.statement.annotation.NotBlank;

/**
 * project cranberry-examples
 * created 2022-01-14 16:11
 *
 * @author Alexander A. Kropotin
 */
public final class NotBlankExamples {

    /**
     * Not blank local variable example string.
     *
     * @param str the str
     * @return the string
     */
    public String notBlankLocalVariableExample(String str) {
        @NotBlank
        String notBlankLocalVariable = str;

        return notBlankLocalVariable;
    }

    /**
     * Not blank method param example string.
     *
     * @param notBlankMethodParam the not blank method param
     * @return the string
     */
    public String notBlankMethodParamExample(@NotBlank String notBlankMethodParam) {
        return notBlankMethodParam;
    }
}