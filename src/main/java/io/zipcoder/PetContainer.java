package io.zipcoder;

import java.util.ArrayList;

public class  PetContainer <Pet> {

    private ArrayList<Pet> pets;

    public PetContainer(){
        this.pets = new ArrayList<>();
    }

    public void addPet(Pet newPet) {
        pets.add(newPet);
    }

    public Pet getPet(int index) {
        return pets.get(index);
    }
}
