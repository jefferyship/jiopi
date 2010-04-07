package org.jiopi.framework;

import org.jiopi.framework.core.CentralConsoleKernel;
import org.jiopi.framework.exception.CentralConsoleNotInitializedException;
import org.jiopi.framework.loader.CentralConsoleKernelLoaderFactory;


public class CentralConsole{
	
	private static CentralConsoleKernel cck = CentralConsoleKernelLoaderFactory.loadCentralConsoleKernel();
	
	public static ModuleConsole accessModuleConsole(String moduleName) {
		return accessModuleConsole(moduleName,null);
	}
	
	public static ModuleConsole accessModuleConsole(String moduleName,String compatibleVersion) {
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		return cck.accessModuleConsole(moduleName,compatibleVersion); 
	}
	
	public static Object objectOperate(Object obj,String registerName,Object... args){
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		return cck.objectOperate(obj, registerName, args);
	}
	
	public static Object objectVariable(Object obj,String variableName){
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		return cck.objectVariable(obj, variableName);
	}
	
	public static void setRootClassLoader(ClassLoader classLoader){
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		cck.setRootClassLoader(classLoader);
	}
	
	public static ClassLoader getClassLoader(){
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		return cck.getClassLoader();
	}
	
	public static void refreshResource(){
		refreshResource(null, null);
	}
	
	public static void refreshResource(String modulename){
		refreshResource(modulename,null);
	}

	public static void refreshResource(String modulename,String version){
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		cck.refreshResource(modulename, version);
	}
	
	public static void start(){
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		cck.start();
	}
	
	public static void restart(){
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		cck.restart();
	}
	
	public static void shutdown() {
		if( cck == null){
			throw new CentralConsoleNotInitializedException();
		}
		cck.shutdown();
	}
	
}
