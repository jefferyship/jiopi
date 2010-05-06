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
package org.jiopi.framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.jiopi.framework.core.version.JIOPI;

/**
 * 
 * 定义自动转载时类的实例化方式 是 单例模式 还是原形模式
 * 
 * <P>
 * 如果没有指定，则系统默认为 原型模式 ,并使用默认构造器生成对象<br/>
 * 当设置为单例模式时,JIOPI容器会确保容器内只有该类的一个实例,并在下次获取时不再重新生成<br/>
 * 如果设置为原型模式,JIOPI不会对生成的对象进行维护，这时亦可指定工厂方法来保证单例,如果有必要的话<br/>
 * 可定义工厂方法和初始化方法，初始化方法会在对象生成并完成相关依赖注入后后被调用<br/>
 * 单例模式的指定仅限于从JIOPi容器中获取时JIOPi容器会保证对象的单例,为了保证绝对单例,建议由
 * 实现类通过工厂方法进行保证，当然，指定单例模式会在JIOPi容器内保留一份引用，可能在今后会用到<br/>
 * 配置文件单例模式没有包含在v0.2中
 * </p>
 * 
 * @version 0.2 2010.5.6
 * @since JIOPi0.2 2010.5.6
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@JIOPI
public @interface Instantiation {
	
	/**
	 * 实例化类型
	 * @since JIOPi0.2 2010.5.6
	 * @see InstanceType
	 */
	InstanceType type() default InstanceType.PROTOTYPE;
	
	/**
	 * 定义工厂方法,如果定义了工厂方法,则将使用工厂方法,而忽略构造函数
	 * @since JIOPi0.2 2010.5.6
	 */
	String factoryMethod() default "";
	
	/**
	 * 初始化方法,必须为 public void函数
	 * @since JIOPi0.2 2010.5.6
	 */
	String initMethod() default "";
	
}
