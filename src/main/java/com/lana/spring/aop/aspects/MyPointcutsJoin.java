package com.lana.spring.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcutsJoin {
    @Pointcut("execution(* add*(..))")
    public void allAddMethods() {

    }
}
