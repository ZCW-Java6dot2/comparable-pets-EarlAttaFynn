package io.zipcoder;

public class Parrot extends Pet {

    public Parrot(String name) {
        super(name);
    }

    @Override
    String speak() {
        return "Polly wanna Cracker!";
    }
}
