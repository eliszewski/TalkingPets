package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Console console = new Console();
        System.out.println("How many pets do you have?");
        int numOfPets = scanner.nextInt();
        List<Pet> pets = new ArrayList<Pet>();
        for(int i = 1; i <= numOfPets; i++){
            String inputPet = console.returnATypeFromUserForPet(i);
            if(inputPet.equals("dog")){//dog
                pets.add(new Dog(console.returnANameFromUserForPet(i)));
            } else if (inputPet.equals("cat")) { //cat
                pets.add(new Cat(console.returnANameFromUserForPet(i)));
            } else if (inputPet.equals("guinea pig")) { //guinea
                pets.add(new GuineaPig(console.returnANameFromUserForPet(i)));
            }
        }
        System.out.println(pets);
    }
}
