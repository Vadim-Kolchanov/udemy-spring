package com.udemy.udemyspring.spring_introduction;

public class Dog implements Pet {

    @Override
    public void say() {
        System.out.println("Wow-wow");
    }
}
