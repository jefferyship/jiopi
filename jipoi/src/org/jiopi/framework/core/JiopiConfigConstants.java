package org.jiopi.framework.core;

import org.jiopi.framework.core.version.JIOPI;

@JIOPI
public class JiopiConfigConstants {
	
	public static final String CONFIG_FILE = "jiopi.properties";
	
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
