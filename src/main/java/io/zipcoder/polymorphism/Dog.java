package io.zipcoder.polymorphism;

public class Dog extends Pet{
    public Dog(String name) {
        super(name);
    }

    public Dog() {
    }

    public String speak() {
        return "Bark Bark Woof!";
    }

}
