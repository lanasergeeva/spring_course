package com.lana.spring.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    private Pet pet;
   /* @Value("${person.surname}")*/
    private String surname;
   /* @Value("33")*/
    private int age;

    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        System.out.println("Person-person");
        this.pet = pet;
    }

    public Person() {

    }

    public String getSurname() {
        return surname;
    }

 /*   public void setSurname(String surname) {
        this.surname = surname;
    }
*/
    public int getAge() {
        return age;
    }

   /* public void setAge(int age) {
        this.age = age;
    }*/

    public void setPet(Pet pet) {
        System.out.println("set pet");
        this.pet = pet;
    }

    public void callYourPetBack() {
        System.out.println("Ко мне!");
        pet.say();
    }
}
