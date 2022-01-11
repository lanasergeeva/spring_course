package com.lana.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingSecurityAspect {

    @Pointcut("execution(* get*())")
    private void allGetMethods() {

    }

    @Before("allGetMethods()")
    public void beforeGetBookAdvice() {
        System.out.println("Попытка получить книгу");
    }

    @Before("allGetMethods()")
    public void beforeMethodWithParam() {
        System.out.println("Проверка прав");
    }

   /* @Before("execution(* get*())")
    public void beforeGetBookAdvice() {
        System.out.println("Попытка получить книгу");
    }

    @Before("execution(* get*())")
    public void beforeMethodWithParam() {
        System.out.println("Проверка прав");
    }*/
}
