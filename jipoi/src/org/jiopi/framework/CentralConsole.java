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
package org.jiopi.framework;

import org.jiopi.framework.core.CentralConsoleKernel;
import org.jiopi.framework.core.loader.CentralConsoleKernelLoaderFactory;
import org.jiopi.framework.core.version.JIOPI;
import org.jiopi.framework.exception.CentralConsoleNotInitializedException;

/**
 * 
 * JIOPi系统的总控操作台
 * 
 * 
 * @since 2010.2.20
 *
 */
@JIOPI
public class CentralConsole{
	
	private static CentralConsoleKernel cck = CentralConsoleKernelLoaderFactory.loadCentralConsoleKernel();
	
	public static ModuleConsole accessModuleConsole(String moduleName) {
		return accessModuleConsole(moduleName,null);
	}
	
	public static ModuleConsole accessModuleConsole(String moduleName,String compatibleVersion) {
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		return cck.accessModuleConsole(moduleName,compatibleVersion); 
	}
	
	public static <T> T accessControlPanel(String moduleName,String compatibleVersion,String registerName,Class<T> c,Object... args){
		return accessModuleConsole(moduleName,compatibleVersion).accessControlPanel(registerName, c, args);
	}
	
	public static <T> T objectOperate(Object obj,String registerName,Class<T> c,Object... args){
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		return cck.objectOperate(obj, registerName,c, args);
	}
	
	public static <T> T objectVariable(Object obj,String variableName,Class<T> c){
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		return cck.objectVariable(obj, variableName,c);
	}
	
	public static void setRootClassLoader(ClassLoader classLoader){
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		cck.setRootClassLoader(classLoader);
	}
	
	public static ClassLoader getClassLoader(){
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		return cck.getClassLoader();
	}
	
	public static void refreshResource(){
		refreshResource(null, null);
	}
	
	public static void refreshResource(String modulename){
		refreshResource(modulename,null);
	}

	public static void refreshResource(String modulename,String version){
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		cck.refreshResource(modulename, version);
	}
	
	public static void start(){
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		cck.start();
	}
	
	public static void restart(){
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		cck.restart();
	}
	
	public static void shutdown() {
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		cck.shutdown();
	}
	
}
