package org.jiopi.framework.core.version;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jiopi.framework.annotation.Blueprint;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Blueprint(name="jiopi", version="0.3", versionInterface=JIOPI.class)
public @interface JIOPI {

}