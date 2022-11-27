package io.zipcoder.polymorphism;

public class Cat extends Pet<Cat>{
    public Cat(String name) {
        super(name);
    }

    public Cat() {
    }



    public String speak() {
        return "Meow Meow...";
    }
}
