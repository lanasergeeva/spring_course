package com.lana.spring.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPetBack();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();
    }
}
