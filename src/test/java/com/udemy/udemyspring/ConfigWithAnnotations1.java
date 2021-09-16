package com.udemy.udemyspring;

import com.udemy.udemyspring.spring_introduction.Cat;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {

    @Test
    public void testComponent() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext3.xml"
        );

        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();

        context.close();
    }

    @Test
    public void testAutowired() {

    }
}
