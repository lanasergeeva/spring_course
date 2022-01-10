package com.lana.spring.confjavacode;

public class Mark implements Child {
    public Mark() {
        System.out.println("Родился Марк");
    }

    @Override
    public void eat() {
        System.out.println("Марк хочет кушать");
    }
}
