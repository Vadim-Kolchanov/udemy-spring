package com.udemy.udemyspring;

import com.udemy.udemyspring.spring_introduction.Person;
import com.udemy.udemyspring.spring_introduction.config.MyConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyConfigTest {

    @Test
    public void testConfig() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        context.close();
    }

}
