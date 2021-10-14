package com.udemy.udemyspring;

import com.udemy.udemyspring.spring_introduction.Cat;
import com.udemy.udemyspring.spring_introduction.Dog;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ScopeTest {

    private final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            "applicationContext3.xml"
    );

    @Test
    public void testScopeSingleton() {
        Dog myDog = context.getBean("dog", Dog.class);
        Dog yourDog = context.getBean("dog", Dog.class);

        assertThat(myDog, is(equalTo(yourDog)));

        context.close();
    }

    @Test
    public void testScopePrototype() {
        Cat myCat = context.getBean("catBean", Cat.class);
        Cat yourCat = context.getBean("catBean", Cat.class);

        assertThat(myCat, is(not(equalTo(yourCat))));

        context.close();
    }

}
