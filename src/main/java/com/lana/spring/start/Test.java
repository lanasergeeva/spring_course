package com.lana.spring.start;

public class Test {

    public String[] cloneAr(String[] s) {
        return s.clone();
    }

    public static void main(String[] args) {
        String[] array = {"Lana", "lana", "la"};
        for (String s : array) {
            System.out.println(s);
        }
        Test t = new Test();
        String[] yu = t.cloneAr(array);
        yu[2] = "Max";
        for (String s : yu) {
            System.out.println(s);
        }

        for (String s : array) {
            System.out.println(s);
        }
    }
}
