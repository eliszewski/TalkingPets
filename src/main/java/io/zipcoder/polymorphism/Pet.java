package io.zipcoder.polymorphism;

public abstract class Pet<T> {
    String name;
    String type;

    public Pet(String name) {
        this.name = name;
        this.type =  this.getClass().getSimpleName();
    }
    public Pet(){
        this.name = "no name";
    }
    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract String speak();

}
