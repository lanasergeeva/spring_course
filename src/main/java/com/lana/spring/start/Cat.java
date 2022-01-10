package com.lana.spring.start;

import org.springframework.stereotype.Component;

/*@Component("catBean")*/
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat-cat-cat");
    }

    public void say() {
        System.out.println("Мяу-мяу-мяу");
    }
}
