package io.github.ololx.cranberry.examples;

import io.github.ololx.cranberry.statement.annotation.NotBlank;

/**
 * project cranberry-examples
 * created 2022-01-14 16:11
 *
 * @author Alexander A. Kropotin
 */
public final class NotBlankExamples {

    public String notBlankLocalVariableExample(String number) {
        @NotBlank
        String notBlankLocalVariable = number;

        return notBlankLocalVariable;
    }

    public String notBlankMethodParamExample(@NotBlank String notBlankMethodParam) {
        return notBlankMethodParam;
    }
}