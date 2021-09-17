package com.udemy.udemyspring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    // Работает внедрение через рефлексию джавы
    @Autowired
    private Pet pet;

    private String surname;
    private int age;

    // С версией 4.4 если есть один конструктор, то спринг сам внедряет зависимости
//    @Autowired
//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Person bean is created");
        System.out.println("Default constructor");
    }

    // Как спринг понимает что это сеттер
    // pet -> Pet -> setPet
//    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Class person: set pet");
        this.pet = pet;
    }

//    // Для внедрения зависимостей название может быть любым
//    @Autowired
//    public void anyMethodName(Pet pet) {
//        System.out.println("Class person: anyMethodName");
//        this.pet = pet;
//    }

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
