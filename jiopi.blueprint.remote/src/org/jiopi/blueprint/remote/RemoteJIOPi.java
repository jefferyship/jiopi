/**
 *
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
 *
 */
package org.jiopi.blueprint.remote;

import org.jiopi.framework.core.version.JIOPI;

/**
 * The interface to call a method which is running in a remote JIOPi container.
 *
 * If arg is Serializable,it will transport to remote server, otherwise, it will transport a remote reference
 * to remote,expect this Object's Class if implement of JIOPi Reference.
 *
 * @version 0.5 ,2010.10.24
 * @since JIOPi0.5 , 2010.10.24
 */
@JIOPI
public interface RemoteJIOPi {

    /**
     * Call a remote method by JIOPi style
     *
     * If the parameter self is not null,it means that this remote call will synchronize it self
     *
     * @param moduleName           the module name
     * @param compatibleVersion    the compatible version
     * @param registerName         the register name of Caller class
     * @param self                 the caller it self at client side
     * @param transportSelf        transport caller if self is not null
     * @param receiveSelf          receive caller from remote if self if not null
     * @param returnType           return type of the method
     * @param args                 method args
     * @param parameterTypes
     * @param <T>                  return type
     * @return                     method's return
     */
    public <T> T JIOPiOperateStrict(String moduleName,String compatibleVersion,String registerName,Object self,boolean transportSelf,boolean receiveSelf,Class<T> returnType,Class<?>[] parameterTypes,Object... args);


    /**
     * Call a remote object's method by objectID
     *
     * @param objectID
     * @param methodName
     * @param returnType
     * @param parameterTypes
     * @param args
     * @param <T>
     * @return
     */
    public <T> T operateStrict(long objectID,String methodName,Class<T> returnType,Class<?>[] parameterTypes,Object... args);


}
