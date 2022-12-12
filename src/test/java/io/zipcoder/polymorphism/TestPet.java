package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class TestPet {
    ArrayList<Pet> pets;
    @Before
    public void setUp(){
        this.pets = new ArrayList<Pet>();
    }
    @Test
    public void testCompare(){
        Pet dog = new Dog("B");
        Pet cat = new Cat("B");
        Pet guinea = new GuineaPig("A");
        pets.add(dog);
        pets.add(cat);
        pets.add(guinea);
        Collections.sort(pets);
        Assert.assertEquals(pets.get(0), guinea);
        Assert.assertEquals(pets.get(2),dog);
    }
    @Test
    public void testAltCompare(){
        Pet dog = new Dog("B");
        Pet dog1 = new Dog("C");
        Pet guinea = new GuineaPig("A");
        pets.add(guinea);
        pets.add(dog);
        pets.add(dog1);
        pets.sort(Pet::compare);
        Assert.assertEquals(pets.get(0),dog);

    }
}
