package com.udemy.udemyspring.spring_introduction;

import com.udemy.udemyspring.spring_introduction.Cat;
import com.udemy.udemyspring.spring_introduction.Dog;
import com.udemy.udemyspring.spring_introduction.Pet;
import org.junit.jupiter.api.Test;

public class PetTest {

    @Test
    public void sayDog() {
        Pet pet = new Dog();
        pet.say();
    }

    @Test
    public void sayCat() {
        Pet pet = new Cat();
        pet.say();
    }
}