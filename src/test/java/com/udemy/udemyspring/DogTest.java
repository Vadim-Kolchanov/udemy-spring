package com.udemy.udemyspring;

import com.udemy.udemyspring.spring_introduction.Cat;
import com.udemy.udemyspring.spring_introduction.Dog;
import com.udemy.udemyspring.spring_introduction.Pet;
import org.junit.jupiter.api.Test;

class PetTest {

    @Test
    void sayDog() {
        Pet pet = new Dog();
        pet.say();
    }

    @Test
    void sayCat() {
        Pet pet = new Cat();
        pet.say();
    }
}