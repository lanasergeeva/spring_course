package com.lana.spring.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("apContext3.xml");
        Dog d1 = context.getBean("dog", Dog.class);
        Dog d2 = context.getBean("dog", Dog.class);
        System.out.println(d1 == d2);
        context.close();
    }
}
