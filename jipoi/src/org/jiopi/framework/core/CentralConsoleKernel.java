package org.jiopi.framework.core;

import org.jiopi.framework.ModuleConsole;

public interface CentralConsoleKernel {
	
	public ModuleConsole accessModuleConsole(String moduleName,String compatibleVersion);
	
	public Object objectOperate(Object obj,String registerName,Object... args);
	
	public Object objectVariable(Object obj,String variableName);
	
	public void setRootClassLoader(ClassLoader classLoader);
	
	public ClassLoader getClassLoader();
	
	public void refreshResource(String modulename,String version);
	
	public void start();
	
	public void restart();
	
	public void shutdown();
	
}
