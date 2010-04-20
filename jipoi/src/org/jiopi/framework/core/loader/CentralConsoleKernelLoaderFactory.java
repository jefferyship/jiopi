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
package org.jiopi.framework.core.loader;

import org.jiopi.framework.core.CentralConsoleKernel;
import org.jiopi.framework.core.Config;
import org.jiopi.framework.core.JiopiConfigConstants;
import org.jiopi.framework.core.version.JIOPI;
import org.jiopi.framework.exception.CentralConsoleInitializeException;

/**
 * 
 * 核心程序装载工厂
 * 
 * @version 0.1 2010.2.21
 * @since JIOPi0.1 2010.2.21
 *
 */
@JIOPI
public class CentralConsoleKernelLoaderFactory {
	
	/**
	 * 
	 * @return
	 * @since JIOPi0.1
	 */
	public static CentralConsoleKernel loadCentralConsoleKernel() {
		String loaderClass = Config.getConfig( JiopiConfigConstants.KERNEL_LOADER_CLASS );
		if( loaderClass==null ) {
			throw new CentralConsoleInitializeException( "cannot find loader class by key:" + JiopiConfigConstants.KERNEL_LOADER_CLASS );
		}
		try {
			Class<?> c = Class.forName( loaderClass );
			CentralConsoleKernelLoader loader = (CentralConsoleKernelLoader)c.newInstance();
			return loader.loadCentralConsoleKernel();
		} catch (Exception e) {
			throw new CentralConsoleInitializeException( e );
		}
	}
	
}
