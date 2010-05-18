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
package org.jiopi.framework.annotation.module;

import org.jiopi.framework.core.version.JIOPI;

/**
 * 
 * 描绘可用的 自动化实例对象时 的实例类型
 * 
 * @version 0.2 2010.5.6
 * @since JIOPi0.2 2010.5.6
 *
 */
@JIOPI
public enum InstanceType {
	
	/**
	 * 原形模式,每次使用时将生成一个新的实例
	 */
	PROTOTYPE,
	
	/**
	 * 单例模式,在组件使用过程中只会生成一个类的实例
	 */
	SINGLETON,
	
	/**
	 * 以配置文件为基准的单例模式,即在使用相同配置装配时,使用相同实例
	 */
	CONFIGURATION_SINGLETON
	
}
