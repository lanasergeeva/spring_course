package com.lana.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("com.lana.spring.aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetExHandAdvice() {
        System.out.println("* beforeGetExHandAdvice обрабатываем исключение");
    }
}
