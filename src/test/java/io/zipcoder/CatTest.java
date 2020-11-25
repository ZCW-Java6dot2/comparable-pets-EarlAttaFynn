package io.zipcoder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void testInheritance() {
        //Given
        Cat cat = new Cat("cat");

        //Then
        Assertions.assertTrue(cat instanceof Pet);
    }

    @Test
    void speak() {
        //Given
        String expected = "Mraawwwwr!!";
        Cat cat = new Cat("cat");

        //Then
        Assertions.assertEquals(expected, cat.speak());
    }
}