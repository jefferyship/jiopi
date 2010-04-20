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

import org.jiopi.framework.core.Config;
import org.jiopi.framework.core.JiopiConfigConstants;
import org.jiopi.framework.core.initializer.Initializer;
import org.jiopi.framework.core.version.JIOPI;

/**
 * 框架初始化函数
 * 
 * 本类的初始化函数建议在整个框架未被调用之前调用,以便系统进行较高级别的初始化操作
 * 
 * @version 0.1 2010.4.11
 * @since JIOPi0.1 2010.4.11
 *
 */
@JIOPI
public class FrameworkInitializer {
	
	/**
	 * @since JIOPi0.1
	 */
	public static void initialize(){
		String initializerClass = Config.getConfig( JiopiConfigConstants.KERNEL_INITIALIZER_CLASS );
		if(initializerClass!=null){
			try {
				Class<?> c = Class.forName( initializerClass );
				Initializer initializer = (Initializer)c.newInstance();
				initializer.initialize();
			} catch (Exception e) {
				
			}
		}
	}
}
