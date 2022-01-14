package com.lana.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAndSecurityAspect {

    @Pointcut("execution(* com.lana.spring.aop.UniLibrary.*())")
    private void allFromUniLibrary() {

    }

    @Pointcut("execution(public void com.lana.spring.aop.UniLibrary.returnMagazine())")
    private void onlyReturnMagazine() {

    }

    @Pointcut("allFromUniLibrary() && !onlyReturnMagazine()")
    private void allWithoutReturnMagazine() {

    }

    @Before("allWithoutReturnMagazine()")
    public void beforeAllMethWithoutReturmMagazine() {
        System.out.println("Все методы из UniLibrary Log, кроме returnMagazine");
    }

    @Pointcut("execution(* com.lana.spring.aop.UniLibrary.get*())")
    private void allGetMethodsFromUniLibrary() {

    }

    @Pointcut("execution(* com.lana.spring.aop.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary() {

    }

    @Pointcut("allReturnMethodsFromUniLibrary() || allGetMethodsFromUniLibrary()")
    private void allReturnAndGetMethodsFromUniLibrary() {

    }

    @Before("allGetMethodsFromUniLibrary()")
    public void beforeMethodGet() {
        System.out.println("Все get методы из UniLibrary Log");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeMethodReturn() {
        System.out.println("Все return методы из UniLibrary Log");
    }

    @Before("allReturnAndGetMethodsFromUniLibrary()")
    public void beforeMethodGetandReturn() {
        System.out.println("Все return "
               + "и get методы из UniLibrary Log");
    }
}
