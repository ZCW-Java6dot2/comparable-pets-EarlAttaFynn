package io.zipcoder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void speak() {
        //Given
        String expected = "Woof!!";
        Dog dog = new Dog("fido");

        //Then
        Assertions.assertEquals(expected, dog.speak());
    }

    @Test
    void testInheritance() {
        //Given
        Dog dog = new Dog("fido");

        //Then
        Assertions.assertTrue(dog instanceof Pet);
    }
}