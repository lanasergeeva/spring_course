package com.lana.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPoint {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfigLib.class);
        UniLibrary library = context.getBean("ulBean", UniLibrary.class);
        SchoolLibrary schoolLibrary = context.getBean("schBean", SchoolLibrary.class);
        library.getBook();
        schoolLibrary.getBook();
        library.getSomething();
        context.close();
    }
}
