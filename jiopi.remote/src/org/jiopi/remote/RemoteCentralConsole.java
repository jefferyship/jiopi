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
package org.jiopi.remote;

import org.jiopi.framework.annotation.blueprint.RegisterControlPanel;


/**
 * The interface specifies methods that a remote JIOPi container should provide.
 *
 *
 * @version 0.5 ,2012.10.24
 * @since JIOPi0.5 , 2010.10.24
 * @author netstarry
 */
@Version
@RegisterControlPanel("jiopi.RemoteCentralConsole")
public interface RemoteCentralConsole {
	
	/**
	 * call the specified remote method
	 * 
	 * @param containerID          the JIOPi container ID
	 * @param moduleName           name of the module
	 * @param compatibleVersion    version of the module
	 * @param controlPanelName     name of the control panel
	 * @param methodName           name of the method
	 * @param returnType           type of return object
	 * @param parameterTypes       type of the parameter
	 * @param args                 arguments of this method call
	 * @return
	 */
	public <T> T methodCallStrict(String containerID,String moduleName,String compatibleVersion,String controlPanelName,String methodName,Class<T> returnType,Class<?>[] parameterTypes,Object... args);
	
	/**
	 * call the specified remote method by the given name and parameters
	 * 
	 * @param containerID
	 * @param moduleName
	 * @param compatibleVersion
	 * @param controlPanelName
	 * @param methodName
	 * @param returnType
	 * @param args
	 * @return
	 */
	public <T> T methodCall(String containerID,String moduleName,String compatibleVersion,String controlPanelName,String methodName,Class<T> returnType,Object... args);
}
