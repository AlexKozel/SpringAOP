package com.springAop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * AOP
 * Configuration
 */
@Aspect //combination of joinPoint and Advice
@Configuration
public class AfterAopAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //What kind of method calls i would intercept
    // execution (* package/class/method()

    /**
     * @param joinPoint is specific interceptor
     *
     * Weaving & Weaver
     */
    //all in comma is POINTCUT
    @AfterReturning(value="execution(* com.springAop.springaop.business.*.*(..))",
    returning ="result"
    ) // in package Business for *any class *any methods with (..) any arguments
    public void afterReturning(JoinPoint joinPoint, Object result){
        //this is ADVICE
        logger.info("After method {}returned with value {}", joinPoint, result);
        //like example = some checks as by valid or access

    }

    /**
     * Work after Throw exception
     * @param joinPoint
     * @param exception
     */
    @AfterThrowing(value="execution(* com.springAop.springaop.business.*.*(..))",
            throwing ="exception"
    )    public void afterThrowing(JoinPoint joinPoint, Exception exception){
        logger.info("{}returned with value {}", joinPoint, exception);
    }

    /**
     * work after method is called
     * @param joinPoint
     */
    @After(value="execution(* com.springAop.springaop.business.*.*(..))")
    public void after(JoinPoint joinPoint){
        logger.info("{}returned with value {}", joinPoint);
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