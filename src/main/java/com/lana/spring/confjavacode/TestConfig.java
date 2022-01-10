package com.lana.spring.confjavacode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(FamConfig.class);

        Wife wife = context.getBean("wifeBean", Wife.class);
        System.out.println(wife.getName());
    }
}
