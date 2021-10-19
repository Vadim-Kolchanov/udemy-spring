package com.udemy.udemyspring.spring_introduction;

import com.udemy.udemyspring.spring_introduction.Cat;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestroyTest {

    @Test
    public void testInitDestroyTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext3.xml"
        );

        Cat cat = context.getBean("catBean", Cat.class);

        cat.say();

        context.close();
    }
}
