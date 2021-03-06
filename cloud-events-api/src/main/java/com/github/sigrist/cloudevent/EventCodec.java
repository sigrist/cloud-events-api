/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.github.sigrist.cloudevent;

import java.io.InputStream;

/**
 * Translate the event object into JSON Format.
 * 
 * @since 1.0.0
 */
public interface EventCodec {

    /**
     * Encode the event into JSON.
     * 
     * @param event The event to convert
     * @return a byte array with the Event in JSON format
     */
    byte[] encode(Event<?> event);

    /**
     * Decode the {@link InputStream} bytes to an {@link Event}.
     * 
     * @param stream       The InputStream with the bytes
     * @param payloadClazz The playload class.
     * @return an Event instance.
     */
    <T> Event<T> decode(InputStream stream, Class<T> payloadClazz);

    /**
     * Get a codec by by the content type.
     * 
     * @param contentType The codec content type.
     * @return an instance of Codec
     */
    Codec get(String contentType);
}
