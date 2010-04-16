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
package org.jiopi.framework.core;

import org.jiopi.framework.ModuleConsole;
import org.jiopi.framework.core.version.JIOPI;

/**
 * 
 * 中央控制台的核心访问接口
 * 
 * @since 2010.2.20
 *
 */
@JIOPI
public interface CentralConsoleKernel {
	
	public ModuleConsole accessModuleConsole(String moduleName,String compatibleVersion);
	
	public <T> T objectOperate(Object obj,String registerName,Class<T> c,Object... args);
	
	public <T> T objectVariable(Object obj,String variableName,Class<T> c);
	
	public void setRootClassLoader(ClassLoader classLoader);
	
	public ClassLoader getClassLoader();
	
	public void refreshResource(String modulename,String version);
	
	public void start();
	
	public void restart();
	
	public void shutdown();
	
}
