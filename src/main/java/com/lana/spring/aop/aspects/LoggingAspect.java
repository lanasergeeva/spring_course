package com.lana.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

 /*   @Pointcut("execution(* get*())")
    private void allGetMethods() {

    }*/

    @Before("com.lana.spring.aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("* Попытка получить книгу");
    }

    /*@Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("Проверка прав");
    }*/

   /* @Before("execution(* get*())")
    public void beforeGetBookAdvice() {
        System.out.println("Попытка получить книгу");
    }

    @Before("execution(* get*())")
    public void beforeMethodWithParam() {
        System.out.println("Проверка прав");
    }*/
}
