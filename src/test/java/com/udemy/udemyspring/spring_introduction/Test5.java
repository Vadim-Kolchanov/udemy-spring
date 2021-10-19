package com.udemy.udemyspring.spring_introduction;

import com.udemy.udemyspring.spring_introduction.Cat;
import com.udemy.udemyspring.spring_introduction.Dog;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {

    @Test
    public void initAndDestroyMethodForSingleton() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext2.xml"
        );

        Dog dog = context.getBean("myDog", Dog.class);
        dog.say();

        Dog yourDog = context.getBean("myDog", Dog.class);
        yourDog.say();

        context.close();
    }

    /**
     * Destroy метод для прототипа не выполнится
     */
    @Test
    public void initAndDestroyMethodForPrototype() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext2.xml"
        );

        Cat myCat = context.getBean("myCat", Cat.class);
        myCat.say();

        context.close();
    }
}
