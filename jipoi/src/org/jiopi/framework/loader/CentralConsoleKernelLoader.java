package org.jiopi.framework.loader;

import org.jiopi.framework.core.CentralConsoleKernel;
import org.jiopi.framework.version.JIOPI;

@JIOPI
public interface CentralConsoleKernelLoader {
	
	CentralConsoleKernel loadCentralConsoleKernel();
	
}
