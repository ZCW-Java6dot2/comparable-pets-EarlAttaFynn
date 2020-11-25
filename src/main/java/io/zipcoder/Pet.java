package io.zipcoder;

abstract class Pet {

    private String name;

    public Pet() {
        this.name = "Hey You!";
    }

    public Pet(String name) {
        this.name = name;
    }

    abstract String speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
