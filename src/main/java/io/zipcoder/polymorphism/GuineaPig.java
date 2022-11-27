package io.zipcoder.polymorphism;

public class GuineaPig extends Pet<GuineaPig>{
    public GuineaPig(String name) {
        super(name);
    }

    public GuineaPig() {
    }



    public String speak() {
        return "Week week";
    }
}
