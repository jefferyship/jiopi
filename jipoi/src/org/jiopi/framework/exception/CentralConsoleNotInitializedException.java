package org.jiopi.framework.exception;

public class CentralConsoleNotInitializedException extends RuntimeException {

	private static final long serialVersionUID = -6451167549807342228L;
	
	public CentralConsoleNotInitializedException() {
	}

	public CentralConsoleNotInitializedException(String message) {
		super(message);
	}

	public CentralConsoleNotInitializedException(Throwable cause) {
		super(cause);
	}

	public CentralConsoleNotInitializedException(String message, Throwable cause) {
		super(message, cause);
	}

}
