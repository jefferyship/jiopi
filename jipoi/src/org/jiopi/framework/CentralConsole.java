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
 * @version 0.1 , 2010.2.20
 * @since JIOPi0.1 , 2010.2.20
 *
 */
@JIOPI
public class CentralConsole{
	
	/**
	 * 
	 * @since JIOPi0.1
	 */
	private static CentralConsoleKernel cck = CentralConsoleKernelLoaderFactory.loadCentralConsoleKernel();
	
	/**
	 * 
	 * 根据moduleName获取最新版本的ModuleConsole对象
	 * 
	 * @param moduleName
	 * @return 指定名称的ModuleConsole对象
	 * @see CentralConsole#accessModuleConsole(String, String)
	 * @since JIOPi0.1
	 */
	public static ModuleConsole accessModuleConsole(String moduleName) {
		return accessModuleConsole(moduleName,null);
	}
	
	/**
	 * 
	 * 根据 moduleName compatibleVersion 返回最匹配的ModuleConsole
	 * 
	 * @param moduleName
	 * @param compatibleVersion
	 * @return
	 * @since JIOPi0.1
	 */
	public static ModuleConsole accessModuleConsole(String moduleName,String compatibleVersion) {
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		return cck.accessModuleConsole(moduleName,compatibleVersion); 
	}
	
	/**
	 * 
	 * 直接从CentralConsole获取指定的对象实例
	 * 
	 * 
	 * @param moduleName
	 * @param compatibleVersion
	 * @param registerName
	 * @param returnType
	 * @param args
	 * @return
	 * @since JIOPi0.1
	 */
	public static <T> T accessControlPanel(String moduleName,String compatibleVersion,String registerName,Class<T> returnType,Object... args){
		return accessModuleConsole(moduleName,compatibleVersion).accessControlPanel(registerName, returnType, args);
	}
	
	/**
	 * 
	 * 直接从CentralConsole获取指定的对象实例,使用精确变量表
	 * 
	 * @param moduleName
	 * @param compatibleVersion
	 * @param registerName
	 * @param returnType
	 * @param parameterTypes
	 * @param args
	 * @return
	 */
	public static <T> T accessControlPanelStrict(String moduleName,String compatibleVersion,String registerName,Class<T> returnType,Object[] parameterTypes,Object... args){
		return accessModuleConsole(moduleName,compatibleVersion).accessControlPanelStrict(registerName, returnType,parameterTypes ,args);
	}
	
	
	/**
	 * 便捷对象反射调用函数,调用对象的指定public方法
	 * <p>如果对象是一个类对象,则相当于访问其静态方法</p>
	 * 
	 * @param obj
	 * @param registerName
	 * @param returnType
	 * @param args
	 * @return
	 * @since JIOPi0.1
	 */
	public static <T> T objectOperate(Object obj,String registerName,Class<T> returnType,Object... args){
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		return cck.objectOperate(obj, registerName,returnType, args);
	}
	
	/**
	 * 使用明确的参数类型表调用指定方法
	 * <P>
	 * 参数类型表可以是String或Class对象,详情参阅包说明
	 * </P>
	 * @param obj
	 * @param registerName
	 * @param returnType
	 * @param parameterTypes  参数类型表
	 * @param args
	 * @return
	 * @since JIOPi0.1
	 */
	public <T> T objectOperateStrict(Object obj,String registerName,Class<T> returnType,Object[] parameterTypes,Object... args){
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		return cck.objectOperateStrict(obj, registerName, returnType, parameterTypes, args);
	}
	
	/**
	 * 便捷对象反射调用函数,访问对象的public成员变量
	 * 
	 * @param obj
	 * @param variableName
	 * @param returnType
	 * @return
	 * @since JIOPi0.1
	 */
	public static <T> T objectVariable(Object obj,String variableName,Class<T> returnType){
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		return cck.objectVariable(obj, variableName,returnType);
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
