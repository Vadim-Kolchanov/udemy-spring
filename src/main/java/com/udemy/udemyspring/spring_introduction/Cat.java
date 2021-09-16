package com.udemy.udemyspring.spring_introduction;

public class Cat implements Pet {

    protected void init() {
        System.out.println("Class Cat: init method");
    }

    private void destroy() {
        System.out.println("Class Cat: destroy method");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
