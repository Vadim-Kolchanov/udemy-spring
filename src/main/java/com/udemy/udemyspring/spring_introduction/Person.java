package com.udemy.udemyspring.spring_introduction;

public class Person {

    private Pet pet;
    private String surname;
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void callYourPet() {
        System.out.println("Hello, my Pet!");
        pet.say();
    }

}
