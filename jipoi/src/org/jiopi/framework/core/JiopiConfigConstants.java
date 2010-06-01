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
package org.jiopi.framework.core;

import org.jiopi.framework.core.version.JIOPI;

/**
 * 
 * JIOPI 配置文件常量
 * 
 * @version 0.1 , 2010.4.10
 * @since JIOPi0.1 , 2010.4.10
 *
 */
@JIOPI
public class JiopiConfigConstants {
	
	/**
	 * JIOPI的配置文件名
	 * @since JIOPi0.1
	 */
	public static final String CONFIG_FILE = "jiopi.properties";
	
	/**
	 * Assembling configuration file name
	 * @since JIOPi0.3
	 */
	public static final String ASSEMBLING_FILE = "jiopi-config.xml";
	
	/**
	 * 配置框架初始化实现类的 属性名
	 * @since JIOPi0.1
	 */
	public static final String KERNEL_INITIALIZER_CLASS = "jiopi.kernel.initializer.class";
	
	/**
	 * 配置框架加载实现类的 属性名
	 * @since JIOPi0.1
	 */
	public static final String KERNEL_LOADER_CLASS = "jiopi.kernel.loader.class";
	
	/**
	 * 热部署配置的 属性名
	 * @since JIOPi0.1
	 */
	public static final String HOTSWAP = "jiopi.hotswap";
	/**
	 * 热部署的默认配置值
	 * @since JIOPi0.1
	 */
	public static final String HOTSWAP_DEFAULT="false";
	
	/**
	 * 
	 * resource pool configuration
	 * 
	 * @since JIOPi0.2
	 */
	public static final String RESOURCEPOOL_PREFIX = "jiopi.resourcepool.";
	public static final String RESOURCEPOOL_PATH="path";
	public static final String RESOURCEPOOL_PRI="pri";
	public static final String RESOURCEPOOL_PRI_DEFAULT="-1";
	
	
	
	
	public static final String CASCADING_START = "jiopi.resourcepools.cascading-start";
	public static final String CASCADING_START_DEFAULT="this";
	public static final String RESOURCEPOOL_HOTSWAP = "hotswap";
	public static final String RESOURCEPOOL_HOTSWAP_DEFAULT = "false";
}
