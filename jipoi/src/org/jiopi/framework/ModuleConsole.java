package org.jiopi.framework;

public interface ModuleConsole {
	
	public Object dynamicOperate(String registerName,Object... args);
	
	public Object operate(String registerName,Object... args);
	
	public Object dynamicVariable(String registerName);
	
	public Object variable(String registerName);
	
	public Object accessControlPanel(String registerName,Object... args);
	
	public ControlPanel accessDynamicControlPanel(String registerName,Object... args);

	public ControlPanel accessStaticControlPanel(String registerName);
	
	public void refreshResource();
	
	public ClassLoader getClassLoader();
}
