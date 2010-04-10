package org.jiopi.framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.jiopi.framework.core.version.JIOPI;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@JIOPI
public @interface SocketControlPanel {
	

	String id() default "";
	

	String module() default  "";
	

	String version() default  "";
	

	String controlpanel();
	
	String configuration() default "";
	
}
