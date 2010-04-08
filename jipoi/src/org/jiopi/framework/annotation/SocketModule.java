package org.jiopi.framework.annotation;

public @interface SocketModule {
	
	String id() default "";
	
	String module() default "";
	
	String version() default  "";
	
	String configuration() default "";

}
