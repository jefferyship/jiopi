package org.jiopi.framework.core.loader;

import org.jiopi.framework.core.CentralConsoleKernel;
import org.jiopi.framework.core.Config;
import org.jiopi.framework.core.JiopiConfigConstants;
import org.jiopi.framework.core.version.JIOPI;
import org.jiopi.framework.exception.CentralConsoleInitializeException;

@JIOPI
public class CentralConsoleKernelLoaderFactory {
	
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
