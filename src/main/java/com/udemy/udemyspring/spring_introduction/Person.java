package com.udemy.udemyspring.spring_introduction;

public class Person {

    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public Person() {
        System.out.println("Person bean is created2");
    }

    // Как спринг понимает что это сеттер
    // pet -> Pet -> setPet
    public void setPet(Pet pet) {
        System.out.println("Class person: set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my Pet!");
        pet.say();
    }

}
