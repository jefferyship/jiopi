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
package org.jiopi.framework.annotation.blueprint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import org.jiopi.framework.core.version.JIOPI;


/**
 * 
 * 将指定类注册为控制面板的构造器类
 * 
 * <p>
 * 构造器类应符合标准构造器类的写法:
 * 
 * public final class T{
 *     //默认构造器
 *     public static HelloWorld _new(){
 *         return null;
 *     }
 * }
 * </p>
 * 
 * @version 0.5 2012.8.27
 * @since JIOPi0.5 2012.8.27
 *
 */
@Target(ElementType.TYPE)
@JIOPI
public @interface RegisterConstructor {
	String value();
}
