package org.zz.model.jdbc.dao.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author xiangqh
 *
 */
@Target({METHOD, FIELD})
@Retention(RUNTIME)

public @interface Id {
}