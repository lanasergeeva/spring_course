package com.lana.spring.confjavacode;

import org.springframework.beans.factory.annotation.Value;

public class Wife {
    @Value("${wife.name}")
    private String name;
    @Value("${wife.age}")
    private int age;
    private Husband husband;

    public Wife(Husband husband) {
        this.husband = husband;
        System.out.println("Wife created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
