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

@JIOPI
public class JiopiConfigConstants {
	
	public static final String CONFIG_FILE = "jiopi.properties";
	
	public static final String KERNEL_INITIALIZER_CLASS = "jiopi.kernel.initializer.class";
	public static final String KERNEL_LOADER_CLASS = "jiopi.kernel.loader.class";
	
	public static final String HOTSWAP = "jiopi.hotswap";
	public static final String HOTSWAP_DEFAULT="false";
	
	public static final String CASCADING_START = "jiopi.resourcepools.cascading-start";
	public static final String CASCADING_START_DEFAULT="this";
	
	public static final String RESOURCEPOOL_PREFIX = "jiopi.resourcepool";
	
	public static final String RESOURCEPOOL_PATH="path";
	
	public static final String RESOURCEPOOL_PRI="pri";
	public static final String RESOURCEPOOL_PRI_DEFAULT="-1";
	
	public static final String RESOURCEPOOL_HOTSWAP = "hotswap";
	public static final String RESOURCEPOOL_HOTSWAP_DEFAULT = "false";
}
