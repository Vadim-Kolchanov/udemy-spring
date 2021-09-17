package com.udemy.udemyspring.spring_introduction;

import org.springframework.stereotype.Component;

// id dog
@Component
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog is created");
    }

    protected void init() {
        System.out.println("Class Dog: init method");
    }

    private void destroy() {
        System.out.println("Class Dog: destroy method");
    }

    @Override
    public void say() {
        System.out.println("Wow-wow");
    }
}
