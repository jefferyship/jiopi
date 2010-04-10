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

import org.jiopi.framework.core.version.JIOPI;

@JIOPI
public interface ModuleConsole {
	
	public Object dynamicOperate(String registerName,Object... args);
	
	public Object operate(String registerName,Object... args);
	
	public Object dynamicVariable(String registerName);
	
	public Object variable(String registerName);
	
	public Object accessControlPanel(String registerName,Object... args);
	
	public ControlPanel accessDynamicControlPanel(String registerName,Object... args);

	public ControlPanel accessStaticControlPanel(String registerName);
	
	public void refreshResource();
	
	public ClassLoader getClassLoader();
}
