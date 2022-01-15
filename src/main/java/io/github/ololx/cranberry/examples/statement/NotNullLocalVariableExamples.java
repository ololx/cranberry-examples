package io.github.ololx.cranberry.examples.statement;

import io.github.ololx.cranberry.statement.annotation.NotNull;

/**
 * project cranberry-examples
 * created 2022-01-13 18:19
 *
 * @author Alexander A. Kropotin
 */
public final class NotNullLocalVariableExamples {

    /**
     * Not null local variable default example object.
     *
     * @param object the object
     * @return the object
     */
    public Object notNullLocalVariableDefaultExample(Object object) {
        @NotNull
        Object notNullLocalVariable = object;

        return notNullLocalVariable;
    }

    /**
     * Not null local variable custom message example object.
     *
     * @param object the object
     * @return the object
     */
    public Object notNullLocalVariableCustomMessageExample(Object object) {
        @NotNull(message = "The variable is empty, Bro =)")
        Object notNullLocalVariable = object;

        return notNullLocalVariable;
    }
}
