package com.tal.base.log.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Base log annotation
 *
 * @Author: Tal
 * @Date: 2020/6/12 16:48
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface ExecuteLog {

    String tag() default "";

    boolean printReturn() default false;

}
