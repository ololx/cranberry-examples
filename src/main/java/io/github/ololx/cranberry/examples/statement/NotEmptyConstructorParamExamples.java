/**
 * Copyright 2022 the project cranberry-examples authors
 * and the original author or authors annotated by {@author}
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.ololx.cranberry.examples.statement;

import io.github.ololx.cranberry.statement.annotation.NotEmpty;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * project cranberry-examples
 * created 2022-02-02 09:40
 *
 * @author Alexander A. Kropotin
 */
public class NotEmptyConstructorParamExamples {

    /**
     * The type Not empty string param default example.
     */
    class NotEmptyStringParamDefaultExample {

        private String obj;

        /**
         * Instantiates a new Not empty string param default example.
         *
         * @param notEmptyConstructorParam the not empty constructor param
         */
        NotEmptyStringParamDefaultExample(@NotEmpty String notEmptyConstructorParam) {
            this.obj = notEmptyConstructorParam;
        }
    }

    /**
     * The type Not empty string param with message example.
     */
    class NotEmptyStringParamWithMessageExample {

        private String obj;

        /**
         * Instantiates a new Not empty string param with message example.
         *
         * @param notEmptyConstructorParam the not empty constructor param
         */
        NotEmptyStringParamWithMessageExample(
                @NotEmpty(message = "The constructor param is empty, Bro =)")
                        String notEmptyConstructorParam) {
            this.obj = notEmptyConstructorParam;
        }
    }

    /**
     * The type Not empty list param default example.
     */
    class NotEmptyListParamDefaultExample {

        private List<Object> list;

        /**
         * Instantiates a new Not empty list param default example.
         *
         * @param notEmptyConstructorParam the not empty constructor param
         */
        NotEmptyListParamDefaultExample(@NotEmpty List<Object> notEmptyConstructorParam) {
            this.list = notEmptyConstructorParam;
        }
    }

    /**
     * The type Not empty list param with message example.
     */
    class NotEmptyListParamWithMessageExample {

        private List<Object> list;

        /**
         * Instantiates a new Not empty list param with message example.
         *
         * @param notEmptyConstructorParam the not empty constructor param
         */
        NotEmptyListParamWithMessageExample(
                @NotEmpty(message = "The constructor param is empty, Bro =)")
                        List<Object> notEmptyConstructorParam) {
            this.list = notEmptyConstructorParam;
        }
    }

    /**
     * The type Not empty set param default example.
     */
    class NotEmptySetParamDefaultExample {

        private Set<Object> list;

        /**
         * Instantiates a new Not empty set param default example.
         *
         * @param notEmptyConstructorParam the not empty constructor param
         */
        NotEmptySetParamDefaultExample(@NotEmpty Set<Object> notEmptyConstructorParam) {
            this.list = notEmptyConstructorParam;
        }
    }

    /**
     * The type Not empty set param with message example.
     */
    class NotEmptySetParamWithMessageExample {

        private Map<Object, Object> list;

        /**
         * Instantiates a new Not empty set param with message example.
         *
         * @param notEmptyConstructorParam the not empty constructor param
         */
        NotEmptySetParamWithMessageExample(
                @NotEmpty(message = "The constructor param is empty, Bro =)")
                        Map<Object, Object> notEmptyConstructorParam) {
            this.list = notEmptyConstructorParam;
        }
    }

    /**
     * The type Not empty map param default example.
     */
    class NotEmptyMapParamDefaultExample {

        private  Map<Object, Object> list;

        /**
         * Instantiates a new Not empty map param default example.
         *
         * @param notEmptyConstructorParam the not empty constructor param
         */
        NotEmptyMapParamDefaultExample(@NotEmpty  Map<Object, Object> notEmptyConstructorParam) {
            this.list = notEmptyConstructorParam;
        }
    }

    /**
     * The type Not empty map param with message example.
     */
    class NotEmptyMapParamWithMessageExample {

        private  Map<Object, Object> list;

        /**
         * Instantiates a new Not empty map param with message example.
         *
         * @param notEmptyConstructorParam the not empty constructor param
         */
        NotEmptyMapParamWithMessageExample(
                @NotEmpty(message = "The constructor param is empty, Bro =)")
                        Map<Object, Object> notEmptyConstructorParam) {
            this.list = notEmptyConstructorParam;
        }
    }

    /**
     * The type Not empty array param with message example.
     */
    class NotEmptyArrayParamWithMessageExample {

        private Object[] list;

        /**
         * Instantiates a new Not empty array param with message example.
         *
         * @param notEmptyConstructorParam the not empty constructor param
         */
        NotEmptyArrayParamWithMessageExample(
                @NotEmpty(message = "The constructor param is empty, Bro =)")
                        Object[] notEmptyConstructorParam) {
            this.list = notEmptyConstructorParam;
        }
    }

    /**
     * The type Not empty array param default example.
     */
    class NotEmptyArrayParamDefaultExample {

        private Object[] list;

        /**
         * Instantiates a new Not empty array param default example.
         *
         * @param notEmptyConstructorParam the not empty constructor param
         */
        NotEmptyArrayParamDefaultExample(@NotEmpty Object[] notEmptyConstructorParam) {
            this.list = notEmptyConstructorParam;
        }
    }
}
