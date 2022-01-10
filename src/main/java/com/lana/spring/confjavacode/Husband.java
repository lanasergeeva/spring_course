package com.lana.spring.confjavacode;

import org.springframework.beans.factory.annotation.Value;

public class Husband {
    @Value("${hus.name}")
    private String name;
    @Value("${hus.age}")
    private int age;

    public Husband() {
        System.out.println("Husband created");
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
