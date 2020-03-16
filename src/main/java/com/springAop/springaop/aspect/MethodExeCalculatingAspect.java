package com.springAop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * AOP
 * Configuration
 */
@Aspect //combination of joinPoint and Advice
@Configuration
public class MethodExeCalculatingAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Around("com.springAop.springaop.aspect.CommonJoinPointConfig.trackTimeAnnotation()") // in package Business for *any class *any methods with (..) any arguments
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {

        long startTime = System.currentTimeMillis();
        joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("Time taken by {} is {}", joinPoint, timeTaken);
        //startTime = x
        //allow execution of method
        //end Time = y
    }
}
/**
 Before — перед вызовом метода
 After — после вызова метода
 After returning — после возврата значения из функции
 After throwing — в случае exception
 After finally — в случае выполнения блока finally
 Around — можно сделать пред., пост., обработку перед вызовом метода, а также вообще обойти вызов метода.
 */