package com.lana.spring.start;

public class Dog implements Pet {

    public Dog() {
        System.out.println("собака");
    }

    public void say() {
        System.out.println("Гав-гав-гав");
    }
}
