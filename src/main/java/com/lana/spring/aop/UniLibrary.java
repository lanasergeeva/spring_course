package com.lana.spring.aop;

import org.springframework.stereotype.Component;

@Component("ulBean")
public class UniLibrary extends AbstractLibrary {
    @Override
    public void getBook() {

        System.out.println("Мы берем книгу из UniLibrary");
        System.out.println("-------------------------------------");
    }

    public void getMagazine() {

        System.out.println("Мы берем книгу из UniLibrary");
        System.out.println("-------------------------------------");
    }

    public void getSomething() {

        System.out.println("Get something");
        System.out.println("-------------------------------------");
    }

    public String returnBook() {
        System.out.println("Возвращаем книгу");
        System.out.println("-------------------------------------");
        return "book";
    }

    public void returnMagazine() {
        System.out.println("Возвращаем журнал");
        System.out.println("-------------------------------------");
    }

    public void addBook(String name, Book book) {
        System.out.println("Приносим книгу");
        System.out.println("-------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Приносим журнал");
        System.out.println("-------------------------------------");
    }
}
