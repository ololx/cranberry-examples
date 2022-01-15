package io.github.ololx.cranberry.examples.statement;

import io.github.ololx.cranberry.statement.annotation.NotNull;

/**
 * project cranberry-examples
 * created 2022-01-13 18:19
 *
 * @author Alexander A. Kropotin
 */
public final class NotNullMethodParamExamples {

    /**
     * Not null method param default example object.
     *
     * @param notNullMethodParam the not null method param
     * @return the object
     */
    public Object notNullMethodParamDefaultExample(@NotNull Object notNullMethodParam) {
        return notNullMethodParam;
    }

    /**
     * Not null method param custom message example object.
     *
     * @param notNullMethodParam the not null method param
     * @return the object
     */
    public Object notNullMethodParamCustomMessageExample(
            @NotNull(message = "The variable is empty, Bro =)") Object notNullMethodParam) {
        return notNullMethodParam;
    }
}