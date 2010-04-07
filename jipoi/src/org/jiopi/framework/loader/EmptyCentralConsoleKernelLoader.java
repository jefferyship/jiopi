package org.jiopi.framework.loader;

import org.jiopi.framework.ModuleConsole;
import org.jiopi.framework.core.CentralConsoleKernel;

public class EmptyCentralConsoleKernelLoader implements
		CentralConsoleKernelLoader {

	public CentralConsoleKernel loadCentralConsoleKernel() {
		return new CentralConsoleKernel() {
			public ModuleConsole accessModuleConsole(String moduleName,
					String compatibleVersion) {
				return null;
			}
			public ClassLoader getClassLoader() {
				return null;
			}
			public void setRootClassLoader(ClassLoader classLoader) {}
			public void start(){}
			public void restart(){}
			public void shutdown(){}
			public void refreshResource(String modulename, String version) {	}
			public Object objectOperate(Object obj, String registerName,Object... args) {return null;}
			public Object objectVariable(Object obj, String variableName) {return null;	}
		};
	}

}
