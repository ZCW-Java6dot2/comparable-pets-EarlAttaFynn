package io.zipcoder;

public class Cat extends Pet {

    public Cat(String name){
        super(name);
    }

    @Override
    String speak() {
        return "Mraawwwwr!!";
    }
}
