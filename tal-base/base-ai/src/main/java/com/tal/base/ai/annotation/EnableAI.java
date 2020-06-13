package com.tal.base.ai.annotation;

import com.tal.base.ai.autoconfig.BaiduAiAutoConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * AI Annotation
 *
 * @Author: Tal
 * @Date: 2020/6/13 11:06
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(BaiduAiAutoConfigure.class)
public @interface EnableAI {
}
