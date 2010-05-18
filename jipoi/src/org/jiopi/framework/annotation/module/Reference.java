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
 * 定义远程方法的参数传递方式为引用传递
 * 
 * 
 * <p>
 * 该标注必须注释在实现类的函数表上
 * </p>
 * 
 * @version 0.x
 * @since JIOPi0.x 
 *
 */
@Target({ElementType.PARAMETER})
@JIOPI
public @interface Reference {

}
