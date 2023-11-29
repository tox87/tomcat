/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

/**
 * {@snippet lang=c :
 * DH* (*SSL_CTX_set_tmp_dh_callback$dh)(SSL*,int,int);
 * }
 */
@SuppressWarnings("javadoc")
public interface SSL_CTX_set_tmp_dh_callback$dh {

    FunctionDescriptor $DESC = FunctionDescriptor.of(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );
    MemorySegment apply(MemorySegment _x0, int _x1, int _x2);
    MethodHandle UP$MH = RuntimeHelper.upcallHandle(SSL_CTX_set_tmp_dh_callback$dh.class, "apply", $DESC);
    
    static MemorySegment allocate(SSL_CTX_set_tmp_dh_callback$dh fi, Arena scope) {
        return RuntimeHelper.upcallStub(UP$MH, fi, $DESC, scope);
    }
    MethodHandle DOWN$MH = RuntimeHelper.downcallHandle($DESC);
    
    static SSL_CTX_set_tmp_dh_callback$dh ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (MemorySegment __x0, int __x1, int __x2) -> {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


