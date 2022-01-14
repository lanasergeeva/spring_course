package com.lana.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAround {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfigLib.class);
        UniLibrary library = context.getBean("ulBean", UniLibrary.class);

        String book = library.returnBook();
        System.out.println(book);
        context.close();
        System.out.println("конец main");
    }
}
