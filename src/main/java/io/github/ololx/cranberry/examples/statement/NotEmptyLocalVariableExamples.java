/**
 * This is free and unencumbered software released into the public domain.
 *
 * Anyone is free to copy, modify, publish, use, compile, sell, or
 * distribute this software, either in source code form or as a compiled
 * binary, for any purpose, commercial or non-commercial, and by any
 * means.
 *
 * In jurisdictions that recognize copyright laws, the author or authors
 * of this software dedicate any and all copyright interest in the
 * software to the public domain. We make this dedication for the benefit
 * of the public at large and to the detriment of our heirs and
 * successors. We intend this dedication to be an overt act of
 * relinquishment in perpetuity of all present and future rights to this
 * software under copyright law.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 * For more information, please refer to <https://unlicense.org>
 */
package io.github.ololx.cranberry.examples.statement;

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
public final class NotEmptyLocalVariableExamples {

    /**
     * Not empty local variable default example string.
     *
     * @param str the str
     * @return the string
     */
    public String notEmptyLocalVariableDefaultExample(String str) {
        @NotEmpty String notEmptyLocalVariable = str;

        return notEmptyLocalVariable;
    }

    /**
     * Not empty local variable custom message example string.
     *
     * @param str the str
     * @return the string
     */
    public String notEmptyLocalVariableCustomMessageExample(String str) {
        @NotEmpty(message = "The variable is empty, Bro =)")
        String notEmptyLocalVariable = str;

        return notEmptyLocalVariable;
    }

    /**
     * Not empty local variable default example list.
     *
     * @param list the list
     * @return the list
     */
    public List<String> notEmptyLocalVariableDefaultExample(List<String> list) {
        @NotEmpty List<String> notEmptyLocalVariable = list;

        return notEmptyLocalVariable;
    }

    /**
     * Not empty local variable custom message example list.
     *
     * @param list the list
     * @return the list
     */
    public List<String> notEmptyLocalVariableCustomMessageExample(List<String> list) {
        @NotEmpty(message = "The variable is empty, Bro =)")
        List<String> notEmptyLocalVariable = list;

        return notEmptyLocalVariable;
    }

    /**
     * Not empty local variable default example set.
     *
     * @param set the set
     * @return the set
     */
    public Set<String> notEmptyLocalVariableDefaultExample(Set<String> set) {
        @NotEmpty Set<String> notEmptyLocalVariable = set;

        return notEmptyLocalVariable;
    }

    /**
     * Not empty local variable custom message example set.
     *
     * @param set the set
     * @return the set
     */
    public Set<String> notEmptyLocalVariableCustomMessageExample(Set<String> set) {
        @NotEmpty(message = "The variable is empty, Bro =)")
        Set<String> notEmptyLocalVariable = set;

        return notEmptyLocalVariable;
    }

    /**
     * Not empty local variable default example map.
     *
     * @param map the map
     * @return the map
     */
    public Map<String, String> notEmptyLocalVariableDefaultExample(Map<String, String> map) {
        @NotEmpty Map<String, String> notEmptyLocalVariable = map;

        return notEmptyLocalVariable;
    }

    /**
     * Not empty local variable custom message example map.
     *
     * @param map the map
     * @return the map
     */
    public Map<String, String> notEmptyLocalVariableCustomMessageExample(Map<String, String> map) {
        @NotEmpty(message = "The variable is empty, Bro =)")
        Map<String, String> notEmptyLocalVariable = map;

        return notEmptyLocalVariable;
    }

    /**
     * Not empty local variable default example string [ ].
     *
     * @param array the array
     * @return the string [ ]
     */
    public String[] notEmptyLocalVariableDefaultExample(String[] array) {
        @NotEmpty String[] notEmptyLocalVariable = array;

        return notEmptyLocalVariable;
    }

    /**
     * Not empty local variable custom message example string [ ].
     *
     * @param array the array
     * @return the string [ ]
     */
    public String[] notEmptyLocalVariableCustomMessageExample(String[] array) {
        @NotEmpty(message = "The variable is empty, Bro =)")
        String[] notEmptyLocalVariable = array;

        return notEmptyLocalVariable;
    }
}