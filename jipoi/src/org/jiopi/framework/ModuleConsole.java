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

/**
 * 组件控制台
 * 
 * @version 0.1 2010.2.20
 * @since JIOPi0.1 2010.2.20
 *
 */
@JIOPI
public interface ModuleConsole {
	
	/**
	 * 动态调用组件的public方法
	 * 
	 * <P>
	 * JIOPi0.1:使用 全类名.方法名 调用类的静态方法,自动根据参数匹配最佳函数<br/>
	 * </P>
	 * 
	 * @param registerName
	 * @param c
	 * @param args
	 * @return
	 * @since JIOPi0.1
	 */
	public <T> T operate(String registerName,Class<T> c,Object... args);
	
	
	/**
	 * 
	 * 动态调用组件的public成员变量
	 * 
	 * <P>
	 * JIOPi0.1:使用 全类名.变量名 访问类的静态成员变量<br/>
	 * </P>
	 * 
	 * @param registerName
	 * @param c
	 * @return
	 * @since JIOPi0.1
	 */
	public <T> T variable(String registerName,Class<T> c);
	
	/**
	 * 
	 * 获得对象实例
	 * 
	 * <P>
	 * JIOPi0.1:通过 全类名 创建对象实例,根据传递的参数自动匹配最佳构造器<br/>
	 * </P>
	 * 
	 * @param registerName
	 * @param c
	 * @param args
	 * @return
	 * @since JIOPi0.1
	 */
	public <T> T accessControlPanel(String registerName,Class<T> c,Object... args);
	
	/**
	 * 
	 * 获得类的静态方法访问控制面板
	 * 
	 * <P>
	 * JIOPi0.1:通过 全类名 获得该类的ControlPanel对象,通过ControlPanel访问类的静态方法/成员变量
	 * </P>
	 * 
	 * @param registerName
	 * @return
	 * @since JIOPi0.1
	 */
	public ControlPanel accessStaticControlPanel(String registerName);
	
	/**
	 * 获得该ModuleConsole的类加载器
	 * 
	 * @return
	 * @since JIOPi0.1
	 */
	public ClassLoader getClassLoader();
	
	public void refreshResource();
}
