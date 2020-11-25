package io.zipcoder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParrotTest2 {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getName() {
        //Given
        String expected = "Harry";
        Parrot Harry = new Parrot(expected);

        //When
        String actual = Harry.getName();

        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setName() {
        //Given
        String name = "Harry";
        Parrot parrot = new Parrot(name);
        String expected = "Polly";

        //When
        parrot.setName(expected);
        String actual = parrot.getName();

        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void speak() {
        //Give
        Parrot parrot = new Parrot("Polly");
        String expected = "Polly wanna Cracker!";

        Assertions.assertEquals(expected, parrot.speak());
    }
}