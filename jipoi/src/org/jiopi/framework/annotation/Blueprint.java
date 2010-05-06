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
 * 蓝图注释
 * 
 * 用于标明一个接口类所属的 蓝图 名称 和 版本
 * 
 * 蓝图 应当定义一个统一版本注解 ，并用该注解 对 版本注解进行注解，从而将一个蓝图的版本说明放置于同一个地方
 * 
 * @version 0.2 2010.5.6
 * @since JIOPi0.2 2010.5.6
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@JIOPI
public @interface Blueprint {
	
	/**
	 * 蓝图名称
	 * 
	 * @since JIOPi0.2
	 */
	String name();
	
	/**
	 * 蓝图版本
	 * @since JIOPi0.2
	 */
	String version();
	
	/**
	 * 蓝图的版本定义接口,一个蓝图的任何一个版本都应当包含相同的一个版本定义接口
	 * @since JIOPi0.2
	 */
	Class<?> versionInterface();
	
}
