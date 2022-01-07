package com.lana.spring.annotation;

import com.lana.spring.start.Cat;
import com.lana.spring.start.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("apContext3.xml");
    /*    Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();*/
        Person person = context.getBean("personBean", Person.class);
        person.callYourPetBack();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();

    }
}
