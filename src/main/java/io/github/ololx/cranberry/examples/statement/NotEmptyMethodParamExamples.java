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
public final class NotEmptyMethodParamExamples {

    /**
     * Not empty method param default example string.
     *
     * @param notEmptyMethodParam the not empty method param
     * @return the string
     */
    public String notEmptyMethodParamDefaultExample(
            @NotEmpty String notEmptyMethodParam) {
        return notEmptyMethodParam;
    }

    /**
     * Not empty method param custom message example string.
     *
     * @param notEmptyMethodParam the not empty method param
     * @return the string
     */
    public String notEmptyMethodParamCustomMessageExample(
            @NotEmpty(message = "The param is empty, Bro =)") String notEmptyMethodParam) {
        return notEmptyMethodParam;
    }

    /**
     * Not empty method param default example list.
     *
     * @param notEmptyMethodParam the not empty method param
     * @return the list
     */
    public List<String> notEmptyMethodParamDefaultExample(
            @NotEmpty List<String> notEmptyMethodParam) {
        return notEmptyMethodParam;
    }

    /**
     * Not empty method param custom message example list.
     *
     * @param notEmptyMethodParam the not empty method param
     * @return the list
     */
    public List<String> notEmptyMethodParamCustomMessageExample(
            @NotEmpty(message = "The param is empty, Bro =)") List<String> notEmptyMethodParam) {
        return notEmptyMethodParam;
    }

    /**
     * Not empty method param default example set.
     *
     * @param notEmptyMethodParam the not empty method param
     * @return the set
     */
    public Set<String> notEmptyMethodParamDefaultExample(
            @NotEmpty Set<String> notEmptyMethodParam) {
        return notEmptyMethodParam;
    }

    /**
     * Not empty method param custom message example set.
     *
     * @param notEmptyMethodParam the not empty method param
     * @return the set
     */
    public Set<String> notEmptyMethodParamCustomMessageExample(
            @NotEmpty(message = "The param is empty, Bro =)") Set<String> notEmptyMethodParam) {
        return notEmptyMethodParam;
    }

    /**
     * Not empty method param default example map.
     *
     * @param notEmptyMethodParam the not empty method param
     * @return the map
     */
    public Map<String, Map> notEmptyMethodParamDefaultExample(
            @NotEmpty Map<String, Map> notEmptyMethodParam) {
        return notEmptyMethodParam;
    }

    /**
     * Not empty method param custom message example map.
     *
     * @param notEmptyMethodParam the not empty method param
     * @return the map
     */
    public Map<String, Map> notEmptyMethodParamCustomMessageExample(
            @NotEmpty(message = "The param is empty, Bro =)") Map<String, Map> notEmptyMethodParam) {
        return notEmptyMethodParam;
    }

    /**
     * Not empty method param default example string [ ].
     *
     * @param notEmptyMethodParam the not empty method param
     * @return the string [ ]
     */
    public String[] notEmptyMethodParamDefaultExample(
            @NotEmpty String[] notEmptyMethodParam) {
        return notEmptyMethodParam;
    }

    /**
     * Not empty method param custom message example string [ ].
     *
     * @param notEmptyMethodParam the not empty method param
     * @return the string [ ]
     */
    public String[] notEmptyMethodParamCustomMessageExample(
            @NotEmpty(message = "The param is empty, Bro =)") String[] notEmptyMethodParam) {
        return notEmptyMethodParam;
    }
}