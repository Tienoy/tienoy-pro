package com.tal.base.log.aspect;

import com.alibaba.fastjson.JSON;
import com.tal.base.log.annotation.ExecuteLog;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Log aspect
 *
 * @Author: Tal
 * @Date: 2020/6/12 16:54
 */
@Aspect
@Order(0)
@Component
@Slf4j
public class LogAspect {

    @Pointcut("@annotation(com.tal.base.log.annotation.ExecuteLog)")
    private void pointCut() {
    }

    @Around("pointCut()&&@annotation(executeLog)")
    public Object log(ProceedingJoinPoint point, ExecuteLog executeLog) throws Throwable {
        Class<?> clazz = point.getTarget().getClass();
        String methodName = point.getSignature().getName();
        String tag = executeLog.tag().length() == 0 ? clazz.getCanonicalName() + "." + methodName : executeLog.tag();
        log.info("{}开始处理----参数：{}", tag, JSON.toJSONString(point.getArgs()));
        long startTime = System.currentTimeMillis();
        try {
            Object object = point.proceed();
            if (executeLog.printReturn()) {
                log.info("{}处理完成，处理用时：{}ms----参数：{}----返回：{}", tag, System.currentTimeMillis() - startTime, JSON.toJSONString(point.getArgs()), JSON.toJSONString(object));
            } else {
                log.info("{}处理完成，处理用时：{}ms----参数：{}", tag, System.currentTimeMillis() - startTime, JSON.toJSONString(point.getArgs()));
            }
            return object;
        } catch (Throwable e) {
            log.error("{}处理发生异常，处理用时：{}ms----参数：{}", tag, System.currentTimeMillis() - startTime, JSON.toJSONString(point.getArgs()), e);
            throw e;
        }
    }


}
