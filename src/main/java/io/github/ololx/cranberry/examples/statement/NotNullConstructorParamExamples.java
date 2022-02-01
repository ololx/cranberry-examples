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

import io.github.ololx.cranberry.statement.annotation.NotNull;

/**
 * project cranberry-examples
 * created 2022-02-01 15:57
 *
 * @author Alexander A. Kropotin
 */
public class NotNullConstructorParamExamples {

    /**
     * The type Not null object param default example.
     */
    class NotNullObjectParamDefaultExample {

        private Object obj;

        /**
         * Instantiates a new Not null object param default example.
         *
         * @param notNullConstructorParam the not null constructor param
         */
        NotNullObjectParamDefaultExample(@NotNull Object notNullConstructorParam) {
            this.obj = notNullConstructorParam;
        }
    }

    /**
     * The type Not null object param with message example.
     */
    class NotNullObjectParamWithMessageExample {

        private Object obj;

        /**
         * Instantiates a new Not null object param with message example.
         *
         * @param notNullConstructorParam the not null constructor param
         */
        NotNullObjectParamWithMessageExample(
                @NotNull(message = "The constructor param is null, Bro =)")
                        Object notNullConstructorParam) {
            this.obj = notNullConstructorParam;
        }
    }
}
