package com.lana.spring.start;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("dog")
public class Dog implements Pet {
    private String name;

    public Dog() {
        System.out.println("bean dog is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init() {
        System.out.println("Class Dog: init method");
    }

    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }

    public void say() {
        System.out.println("Гав-гав-гав");
    }
}
