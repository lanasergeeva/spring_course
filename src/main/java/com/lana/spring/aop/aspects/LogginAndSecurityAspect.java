package com.lana.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAndSecurityAspect {

    @Pointcut("execution(com.lana.spring.aop.UniLibrary get*())")
    private void allGetMethodsFromUniLibrary() {

    }

    @Before("allGetMethodsFromUniLibrary()")
    public void beforeMethodWithParam() {
        System.out.println("Все методы из UniLibrary Log");
    }
}
