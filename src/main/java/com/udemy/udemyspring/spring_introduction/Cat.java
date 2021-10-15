package com.udemy.udemyspring.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// default id for SQLTest -> "SQLTest"
// default id = "cat"
//@Component("catBean")
//@Scope("prototype")
public class Cat implements Pet {

    @PostConstruct
    protected void init() {
        System.out.println("Class Cat: init method");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Class Cat: destroy method");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
