package com.springAop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
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
public class BeforeAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //What kind of method calls i would intercept
    // execution (* package/class/method()

    /**
     * @param joinPoint is specific interceptor
     *
     * Weaving & Weaver
     */
    //all in comma is POINTCUT
    @Before("execution(* com.springAop.springaop.business.*.*(..))") // in package Business for *any class *any methods with (..) any arguments
    public void before(JoinPoint joinPoint){
        //this is ADVICE
        logger.info("intercepted Method Calls {}", joinPoint);
        //like example = some checks as by valid or access

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