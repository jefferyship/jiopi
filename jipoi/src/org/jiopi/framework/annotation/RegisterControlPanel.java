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
 * 将 接口/类/方法/成员变量 注册到 控制面板
 * 
 * <p>
 * 值为 控制面板的名称,默认为 接口/方法/变量 名<br/>
 * 如果遇到同名现象(仅限于当前组件内),则以先注册的为准,不过先后顺序不可预知<br/>
 * 当注册方法名时,如有同名函数，只要在一个函数上进行了注册，则相当于注册了所有同名函数,调用时会根据参数表自动选择最佳,<br/>
 * 实现类上标注该接口声明 当 调用方 准备使用 一个module 的一个接口的时候，系统可以自动找当该接口的实现类<br/>
 * 仅允许在 蓝图 的接口中进行别名注册,当在实现类上增加该标注时，JIOPi容器应当自动将该实现类与其实现的接口进行绑定
 * </p>
 * 
 * @version 0.2 2010.5.6
 * @since JIOPi0.2 2010.5.6
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@JIOPI
public @interface RegisterControlPanel {
	String value() default "";
}
