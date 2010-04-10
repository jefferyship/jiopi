package org.jiopi.framework.annotation;

import org.jiopi.framework.core.version.JIOPI;

@JIOPI
public @interface SocketModule {
	
	String id() default "";
	
	String module() default "";
	
	String version() default  "";
	
	String configuration() default "";

}
