package org.jiopi.framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.jiopi.framework.version.JIOPI;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@JIOPI
public @interface Hotswap {
	String resetMethod() default "";
}
