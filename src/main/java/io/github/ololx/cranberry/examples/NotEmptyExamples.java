package io.github.ololx.cranberry.examples;

import io.github.ololx.cranberry.statement.annotation.NotEmpty;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * project cranberry-examples
 * created 2022-01-14 16:11
 *
 * @author Alexander A. Kropotin
 */
public final class NotEmptyExamples {

    /**
     * Not empty local variable example string.
     *
     * @param str the str
     * @return the string
     */
    public String notEmptyLocalVariableExample(String str) {
        @NotEmpty
        String notEmptyLocalVariable = str;

        return notEmptyLocalVariable;
    }

    /**
     * Not empty local variable example list.
     *
     * @param list the list
     * @return the list
     */
    public List<String> notEmptyLocalVariableExample(List<String> list) {
        @NotEmpty
        List<String> notEmptyLocalVariable = list;

        return notEmptyLocalVariable;
    }

    /**
     * Not empty local variable example set.
     *
     * @param set the set
     * @return the set
     */
    public Set<String> notEmptyLocalVariableExample(Set<String> set) {
        @NotEmpty
        Set<String> notEmptyLocalVariable = set;

        return notEmptyLocalVariable;
    }

    /**
     * Not empty local variable example map.
     *
     * @param map the map
     * @return the map
     */
    public Map<String, String> notEmptyLocalVariableExample(Map<String, String> map) {
        @NotEmpty
        Map<String, String> notEmptyLocalVariable = map;

        return notEmptyLocalVariable;
    }

    /**
     * Not empty local variable example string [ ].
     *
     * @param array the array
     * @return the string [ ]
     */
    public String[] notEmptyLocalVariableExample(String[] array) {
        @NotEmpty
        String[] notEmptyLocalVariable = array;

        return notEmptyLocalVariable;
    }

    /**
     * Not empty method param example string.
     *
     * @param notEmptyMethodParam the not empty method param
     * @return the string
     */
    public String notEmptyMethodParamExample(@NotEmpty String notEmptyMethodParam) {
        return notEmptyMethodParam;
    }

    /**
     * Not empty method param example list.
     *
     * @param notEmptyMethodParam the not empty method param
     * @return the list
     */
    public List<String> notEmptyMethodParamExample(@NotEmpty List<String> notEmptyMethodParam) {
        return notEmptyMethodParam;
    }

    /**
     * Not empty method param example set.
     *
     * @param notEmptyMethodParam the not empty method param
     * @return the set
     */
    public Set<String> notEmptyMethodParamExample(@NotEmpty Set<String> notEmptyMethodParam) {
        return notEmptyMethodParam;
    }

    /**
     * Not empty method param example map.
     *
     * @param notEmptyMethodParam the not empty method param
     * @return the map
     */
    public Map<String, Map> notEmptyMethodParamExample(@NotEmpty Map<String, Map> notEmptyMethodParam) {
        return notEmptyMethodParam;
    }

    /**
     * Not empty method param example string [ ].
     *
     * @param notEmptyMethodParam the not empty method param
     * @return the string [ ]
     */
    public String[] notEmptyMethodParamExample(@NotEmpty String[] notEmptyMethodParam) {
        return notEmptyMethodParam;
    }
}