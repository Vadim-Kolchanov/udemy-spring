package com.udemy.udemyspring.spring_introduction;

import com.udemy.udemyspring.spring_introduction.Pet;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2Context {

    @Test
    public void mainContext() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }

}
