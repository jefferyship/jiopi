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

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import org.jiopi.framework.core.version.JIOPI;

/**
 * 
 * 通过ControlPanel注入一个模块的控制面板
 * 与SocketModule不同的是,SocketControlPanel使用ControlPanel对象进行注入访问,而非接口访问
 * 
 * @version 0.3 2010.5.20
 * @since JIOPi0.3 2010.5.20
 *
 */
@Target(ElementType.FIELD)
@JIOPI
public @interface SocketControlPanel {
	

	String id() default "";
	

	String module() default  "";
	

	String version() default  "";
	

	String controlpanel();
	
	String configuration() default "";
	
}
