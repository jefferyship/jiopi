package org.jiopi.framework.loader;

import org.jiopi.framework.core.CentralConsoleKernel;
import org.jiopi.framework.exception.CentralConsoleInitializeException;
import org.jiopi.framework.util.Config;

public class CentralConsoleKernelLoaderFactory {
	
	private static final String LOADER_CLASS = "jiopi.kernel.loader.class";
	
	public static CentralConsoleKernel loadCentralConsoleKernel() {
		String loaderClass = Config.getConfig( LOADER_CLASS );
		if( loaderClass==null ) {
			throw new CentralConsoleInitializeException( "cannot find loader class by key:" + LOADER_CLASS );
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
