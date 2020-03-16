package com.springAop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.springAop.springaop.business.*.*(..))")
    public void dataLayerExe(){
    }

   @Pointcut("@annotation(com.springAop.springaop.aspect.TrackTime)")
    public void trackTimeAnnotation(){}

    @Pointcut("bean(*dao*)")
    public void beanContainingDao(){
    }
}
