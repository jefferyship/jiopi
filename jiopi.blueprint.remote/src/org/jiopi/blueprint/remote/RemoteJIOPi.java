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

import org.jiopi.framework.annotation.blueprint.RegisterControlPanel;

/**
 * The interface to call a method which is running in a remote JIOPi container.
 *
 * If arg is Serializable,it will transport to remote server, otherwise, it will transport a remote reference
 * to remote,expect this Object's Class if implement of JIOPi Reference.
 *
 * @version 0.5 ,2010.10.24
 * @since JIOPi0.5 , 2010.10.24
 */
@Version
@RegisterControlPanel("jiopi.RemoteJIOPi")
public interface RemoteJIOPi {


    /**
     *
     * @param moduleName
     * @param compatibleVersion
     * @param registerName
     * @param args
     * @return
     */
    public RemoteReference accessRemoteControlPanel(String moduleName,String compatibleVersion,String registerName,Object... args);

    /**
     *
     * @param moduleName
     * @param compatibleVersion
     * @param registerName
     * @param parameterTypes
     * @param args
     * @return
     */
    public RemoteReference accessRemoteControlPanelStrict(String moduleName,String compatibleVersion,String registerName,Class<?>[] parameterTypes,Object... args);

    /**
     * Call a remote method when the reference object is partly remotely
     *
     * @param moduleName
     * @param compatibleVersion
     * @param className
     * @param objectID
     * @param methodName
     * @param self
     * @param transportSelf
     * @param receiveSelf
     * @param parameterTypes
     * @param args
     * @return
     */
    public Object operateJIOPiRemoteStrict(String moduleName,String compatibleVersion,String className,long objectID,String methodName,Object self,boolean transportSelf,boolean receiveSelf,Class<?>[] parameterTypes,Object... args);


    /**
     * Call a remote object's method by objectID
     *
     * The self transporting depends on the call's JIOPi container
     *
     * @param objectID         objectID
     * @param methodName       methodName
     * @param self             the caller itself
     * @param transportSelf    transportSelf
     * @param receiveSelf      receiveSelf
     * @param parameterTypes   parameterTypes
     * @param args             args
     * @return                 method's return
     */
    public Object operateRemoteStrict(long objectID,String methodName,Object self,boolean transportSelf,boolean receiveSelf,Class<?>[] parameterTypes,Object... args);

    
}
