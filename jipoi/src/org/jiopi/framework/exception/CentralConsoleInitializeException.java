package org.jiopi.framework.exception;

import org.jiopi.framework.core.version.JIOPI;

@JIOPI
public class CentralConsoleInitializeException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public CentralConsoleInitializeException() {
	}

	public CentralConsoleInitializeException(String message) {
		super(message);
	}

	public CentralConsoleInitializeException(Throwable cause) {
		super(cause);
	}

	public CentralConsoleInitializeException(String message, Throwable cause) {
		super(message, cause);
	}

}
