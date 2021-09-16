package com.udemy.udemyspring.spring_introduction;

import org.springframework.stereotype.Component;

// default id for SQLTest -> "SQLTest"
// default id = "cat"
@Component("catBean")
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
