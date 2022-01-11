package com.lana.spring.aop;

import org.springframework.stereotype.Component;

@Component("ulBean")
public class UniLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary");
    }

    public void getMagazine() {
        System.out.println("Мы берем книгу из UniLibrary");
    }

    public void getSomething() {
        System.out.println("Get something");
    }

    public void returnBook() {
        System.out.println("Get something");
    }

    public void returnMagazine() {
        System.out.println("Get something");
    }

    public void addBook() {
        System.out.println("Get something");
    }

    public void addMagazine() {
        System.out.println("Get something");
    }
}
