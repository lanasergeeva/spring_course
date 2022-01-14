package com.lana.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Пытаются вернуть книгу");
        Object targetMethRsl = pjp.proceed();
        System.out.println("aroundReturnBookAdvice()  вернули книгу");
        return targetMethRsl;
    }
}
