package com.lhj.dubbocloudconsumer.utils;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
// 多个切面，order值越小执行顺序越靠前
@Order(-1)
public class AspectLog {

    @Pointcut("@annotation(com.lhj.dubbocloudconsumer.utils.LogAop)")
    public void logAop(){}

    @Before("logAop()")
    public void beforeRun() {
        System.out.println("在注解之前执行");
    }

    @Around("logAop() && @annotation(logAop)")
    public Object around(ProceedingJoinPoint joinPoint, LogAop logAop) {
        Object obj = null;
        try {
           // AnnotationDemo注解的属性值
            logAop.message();
            Object[] args = joinPoint.getArgs();
            String arg = JSON.toJSONString(args);
            System.out.println("请求参数："+ arg);
            Signature signature = joinPoint.getSignature();
            // 方法package路径
            String methodUrl = signature.getDeclaringTypeName();
            // 方法名，不包含package路径
            String method = signature.getName();
            System.out.println("正在执行" + method + "方法，路径：" + methodUrl);
            // obj是返回的结果，joinPoint.proceed用于启动目标方法执行，非常重要
            obj = joinPoint.proceed(args);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("切面执行" + obj);
        return obj;
    }

    @After("logAop()")
    public void after() {
        System.out.println("在注解之后执行");
    }

    @AfterThrowing("logAop()")
    public void afterThrowing(JoinPoint joinPoint) {
        System.out.println("在afterThrowing之后执行");
    }

    @AfterReturning("logAop()")
    public void afterReturning(JoinPoint joinPoint) {
        System.out.println("在afterReturning之后执行");
    }

}
