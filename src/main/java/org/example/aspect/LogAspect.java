package org.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    @Before("execution(* org.example.controller.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("接口被调用：" + joinPoint.getSignature().getName());
    }
}