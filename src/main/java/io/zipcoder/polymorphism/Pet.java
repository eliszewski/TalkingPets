package io.zipcoder.polymorphism;

import java.util.Comparator;

public abstract class Pet implements Comparable<Pet>{
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

    public int compareTo(Pet p) {
        if(this.name.compareTo(p.name) > 0) return 1;
        else if(this.name.compareTo(p.name) < 0 ) return -1;
        else {
            return Integer.compare(this.type.compareTo(p.type), 0);
        }
    }
    public static int compare(Pet o1, Pet o2) {
        if(o1.type.equals(o2.type)) return o1.name.compareTo(o2.name);
        else return o1.type.compareTo(o2.type);
    }
    public class PetSortByTypeFirst implements Comparator<Pet> {
        public int compare(Pet o1, Pet o2) {
            if(o1.type.equals(o2.type)) return o1.name.compareTo(o2.name);
            else return o1.type.compareTo(o2.type);
        }
    }

}
