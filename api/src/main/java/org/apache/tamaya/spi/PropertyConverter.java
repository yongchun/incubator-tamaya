/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.tamaya.spi;


/**
 * Interface for an property that converts a configured String into something else.
 * This is used for implementing type conversion from a property (String) to a certain target
 * type. Hereby the target type can be multivalued (eg collections) or complex if needed.
 */
public interface PropertyConverter<T>{

    /**
     * Convert the given configuration keys from it' String representation into the required target type.
     * The context instance passed also allows to add a list of supported formats, which is very handy in case a
     * value could not be converted. This list of supported formats can then shown to the user to give some hints
     * how a value could be configured.
     * @param context the  {@link ConversionContext}, containing the String value and the requested configuration key.
     * @return converted keys
     * @see ConversionContext#addSupportedFormats(Class, String...)
     */
    T convert(String value, ConversionContext context);

}
