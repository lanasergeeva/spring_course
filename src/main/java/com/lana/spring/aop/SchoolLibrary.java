package com.lana.spring.aop;

import org.springframework.stereotype.Component;

@Component("schBean")
public class SchoolLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из SchoolLibrary");
    }
}
