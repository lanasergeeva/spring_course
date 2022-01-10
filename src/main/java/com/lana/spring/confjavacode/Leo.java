package com.lana.spring.confjavacode;

public class Leo implements Child {

    public Leo() {
        System.out.println("Родился Лео");
    }

    @Override
    public void eat() {
        System.out.println("Лео хочет кушать");
    }
}
