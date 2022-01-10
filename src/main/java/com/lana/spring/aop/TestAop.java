package com.lana.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAop {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfigLib.class);
        Library library = context.getBean("libraryBean", Library.class);
        library.getBook();
        context.close();
    }
}
