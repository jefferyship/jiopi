package org.jiopi.framework;

public interface ControlPanel {
	
	public Object operate(String registerName,Object... args);
	
	public Object variable(String variableName);
	
}
