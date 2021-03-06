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

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.jiopi.framework.core.version.JIOPI;

/**
 * 
 * 读取jiopi配置文件
 * 
 * @version 0.1 , 2010.2.21
 * @since JIOPi0.1 2010.2.21
 *
 */
@JIOPI
public class Config {
	
	
	/**
	 * @since JIOPi0.1
	 */
	private static Properties pro = new Properties();
	
	static {
		InputStream in = null;
		try {
			in = Config.class.getClassLoader().getResourceAsStream( JiopiConfigConstants.CONFIG_FILE );
			if( in!=null ) {
				pro.load( in );
			} else {
				throw new RuntimeException( "cannot find configuration file: " + JiopiConfigConstants.CONFIG_FILE
					+ " in class path.");
			}
		} catch (IOException e) {
			throw new RuntimeException( e );
		} finally {
			close( in );
		}
	}
	
	private static void close( Closeable c ) {
		if( c!=null ) {
			try {
				c.close();
			} catch (IOException e) {
			}
		}
	}
	
	/**
	 * 获得JIOPI类加载器下的JIOPI配置
	 * 
	 * @return
	 * @since JIOPi0.1
	 */
	public static Properties getJiopiProperties(){
		return pro;
	}
	
	/**
	 * 获得JIOPI类加载器下的JIOPI指定配置值
	 * 
	 * @param key
	 * @return
	 * @since JIOPi0.1
	 */
	public static String getConfig( String key ) {
		return pro.getProperty( key );
	}
	
}
