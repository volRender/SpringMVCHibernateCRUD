package com.litvishko.spring.mvc_hibernate_crud.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Around("execution(* com.litvishko.spring.mvc_hibernate_crud.dao.*.*(..))")
    public Object StartAndEndsRepositoryMethodsLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String name = methodSignature.getName();
        System.out.println("Start method: " + name);
        Object targetMethodResult = proceedingJoinPoint.proceed();
        System.out.println("End method: " + name);
        return targetMethodResult;
    }

}
