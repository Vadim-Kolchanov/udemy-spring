package com.udemy.udemyspring.spring_introduction;

import com.udemy.udemyspring.spring_introduction.Cat;
import com.udemy.udemyspring.spring_introduction.Person;
import com.udemy.udemyspring.spring_introduction.config.MyConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class MyConfigTest {

    private final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

    @Test
    public void testConfig() {
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        context.close();
    }

    @Test
    public void testScopeConfig() {
        Cat cat = context.getBean("catBean", Cat.class);
        Cat cat2 = context.getBean("catBean", Cat.class);

        assertThat(cat, is(equalTo(cat2)));
    }
}
