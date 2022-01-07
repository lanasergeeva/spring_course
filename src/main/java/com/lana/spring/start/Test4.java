package com.lana.spring.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("apContext2.xml");
        Dog d1 = context.getBean("myPet", Dog.class);
        Dog d2 = context.getBean("myPet", Dog.class);
        System.out.println(d1 == d2);
        //System.out.println(d1);
        //System.out.println(d2);
        d1.setName("Belka");
        d2.setName("Strelka");
        d1.say();
        d2.say();
        context.close();
    }
}
