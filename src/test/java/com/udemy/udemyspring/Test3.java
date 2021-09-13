package com.udemy.udemyspring;

import com.udemy.udemyspring.spring_introduction.Person;
import com.udemy.udemyspring.spring_introduction.Pet;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    @Test
    public void callYourPet() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);

        Person person = new Person(pet);
        person.callYourPet();

        context.close();
    }

}
