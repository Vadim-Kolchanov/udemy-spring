package com.udemy.udemyspring.spring_introduction;

import com.udemy.udemyspring.spring_introduction.Cat;
import com.udemy.udemyspring.spring_introduction.Dog;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class Test4 {

    @Test
    public void testSingleton() {
        // Можно перечислять сколь угодно много xml файлов через запятую
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext2.xml"
        );

        Dog myDog = context.getBean("myDog", Dog.class);
        Dog yourDog = context.getBean("myDog", Dog.class);

        assertThat(myDog, is(yourDog));

        context.close();
    }

    @Test
    public void testPrototype() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext2.xml"
        );

        Cat myCat = context.getBean("myCat", Cat.class);
        Cat yourCat = context.getBean("myCat", Cat.class);

        assertThat(myCat, is(not(yourCat)));

        context.close();
    }

}
