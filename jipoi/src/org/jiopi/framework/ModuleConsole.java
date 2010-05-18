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
 * @version 0.2 2010.5.6
 * @since JIOPi0.1 2010.2.20
 *
 */
@JIOPI
public interface ModuleConsole {
	
	/**
	 * 动态调用组件的public方法
	 * 
	 * <P>
	 * JIOPi0.2:允许在接口中定义方法别名,以实现快捷调用,如果方法不是静态方法,则根据类上定义的实例化方式进行对象的实例化<br/>
	 * JIOPi0.1:使用 全类名.方法名 调用类的静态方法,自动根据参数匹配最佳函数<br/>
	 * </P>
	 * 
	 * @param registerName
	 * @param returnType
	 * @param args
	 * @return
	 * @since JIOPi0.1
	 */
	public <T> T operate(String registerName,Class<T> returnType,Object... args);
	
	/**
	 * 
	 * 使用明确的参数表调用方法
	 * 
	 * 
	 * @param registerName
	 * @param returnType
	 * @param parameterTypes
	 * @param args
	 * @return
	 * @see ModuleConsole#operate(String, Class, Object...)
	 * @since JIOPi0.1
	 */
	public <T> T operateStrict(String registerName,Class<T> returnType,Object[] parameterTypes,Object... args);
	
	/**
	 * 
	 * 动态调用组件的public成员变量
	 * 
	 * <P>
	 * JIOPi0.2:允许在接口中定义静态变量别名,以实现快捷调用<br/>
	 * JIOPi0.1:使用 全类名.变量名 访问类的静态成员变量<br/>
	 * </P>
	 * 
	 * @param registerName
	 * @param returnType
	 * @return
	 * @since JIOPi0.1
	 */
	public <T> T staticVariable(String registerName,Class<T> returnType);
	
	/**
	 * 
	 * 获得对象实例
	 * 
	 * <P>
	 * JIOPi0.2:允许在接口中定义接口的别名，使用接口名/别名 获得接口对应的实现类<br/>
	 * JIOPi0.1:通过 全类名 创建对象实例,根据传递的参数自动匹配最佳构造器<br/>
	 * </P>
	 * <p>
	 * 从0.2开始,在使用接口获取对象时,仅在 实现类定义为 原型时，参数会作为构造器/工厂方法
	 * 的参数传递，以获取对象实例，但 这个规则应当在 蓝图 中进行说明
	 * </p>
	 * 
	 * @param registerName
	 * @param returnType
	 * @param args
	 * @return
	 * @since JIOPi0.1
	 */
	public <T> T accessControlPanel(String registerName,Class<T> returnType,Object... args);
	
	/**
	 * 
	 * 使用精确变量表获得对象实例
	 * 
	 * @param registerName
	 * @param returnType
	 * @param parameterTypes
	 * @param args
	 * @return
	 * @see #accessControlPanel(String, Class, Object...)
	 * @since JIOPi0.1
	 */
	public <T> T accessControlPanelStrict(String registerName,Class<T> returnType,Object[] parameterTypes,Object... args);
	
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
