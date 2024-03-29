package com.udemy.udemyspring.spring_introduction.config;

import com.udemy.udemyspring.spring_introduction.Cat;
import com.udemy.udemyspring.spring_introduction.Person;
import com.udemy.udemyspring.spring_introduction.Pet;
import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("com.udemy.udemyspring.spring_introduction")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    // beanId = catBean (имя метода)
    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
