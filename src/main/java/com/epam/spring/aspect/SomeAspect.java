package com.epam.spring.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class SomeAspect {

    @Pointcut("execution( * com.epam.spring.bean.SomeBean.doSmth(String)) && args(data)")
    public void intercept(String data){

    }

    @Pointcut("execution( * com.epam.spring.bean.SomeBean.doSmth(..))")
    public void performance(){
    }

    @Around("performance()")
    public void aroundWork(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("Starting work");
            System.out.println("Begin time" + System.currentTimeMillis());
            String result = (String) joinPoint.proceed(new Object[] {"Smth other"});
            System.out.println("Finish time" + System.currentTimeMillis());
            System.out.println("End of work: " + result);
        } catch (Throwable throwable){

        }
    }

    @Before("intercept(data)")
    public void beforeWork(String data){
        System.out.println("Intercepted before " + data);
    }

    @After("intercept(data)")
    public void afterWork(String data){
        System.out.println("Intercepted after " + data);
    }

}
