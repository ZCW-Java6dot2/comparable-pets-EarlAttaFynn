package io.zipcoder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetContainerTest {

    //Given
    private Cat cat = new Cat("cat");
    private Dog dog = new Dog("fido");
    private Parrot parrot = new Parrot("Polly");
    private PetContainer petContainer = new PetContainer();

    @Test
    void getPet() {
        //when
        petContainer.addPet(cat);
        petContainer.addPet(dog);
        petContainer.addPet(parrot);

        //Then
        Assertions.assertEquals(cat, petContainer.getPet(0));
        Assertions.assertEquals(dog, petContainer.getPet(1));
        Assertions.assertEquals(parrot, petContainer.getPet(2));

    }
}