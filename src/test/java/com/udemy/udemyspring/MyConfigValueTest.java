package com.udemy.udemyspring;

import com.udemy.udemyspring.spring_introduction.Person;
import com.udemy.udemyspring.spring_introduction.config.MyConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class MyConfigValueTest {

    @Test
    public void testValue() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        assertThat(person.getAge(), is(equalTo(23)));

        context.close();
    }

}
