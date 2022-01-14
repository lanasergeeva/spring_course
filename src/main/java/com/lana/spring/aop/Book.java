package com.lana.spring.aop;

import org.springframework.beans.factory.annotation.Value;

public class Book {
    @Value("Преступление и наказание")
    private String name;
    @Value("Ф.М. Достоевский")
    private String author;

    public Book() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
