package org.jiopi.framework;

import org.jiopi.framework.version.JIOPI;

@JIOPI
public interface ControlPanel {
	
	public Object operate(String registerName,Object... args);
	
	public Object variable(String variableName);
	
}
