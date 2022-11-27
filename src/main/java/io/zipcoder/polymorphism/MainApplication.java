package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numOfPets = scanner.nextInt();
        List<Pet> pets = new ArrayList<Pet>();
        for(int i = 1; i <= numOfPets; i++){
            Pet petToAdd;
            System.out.println("Types of Pets: Cat 1 | Dog 2 | Guinea Pig 3");
            System.out.println("Enter pet type number " + i );
            int inputPet = scanner.nextInt();
            System.out.println("Enter the pet's name");
            String inputName = scanner.nextLine();
            if(inputPet == 1){ //dog
//                System.out.println("Enter the pet's name");
//                inputName = scanner.nextLine();
                pets.add(new Dog(inputName));
            } else if (inputPet == 2) { //cat
//                System.out.println("Enter the pet's name");
//                inputName = scanner.nextLine();
                pets.add(new Cat(inputName));
            } else if (inputPet == 3) { //guinea
//                System.out.println("Enter the pet's name");
//                inputName = scanner.nextLine();
                pets.add(new GuineaPig(inputName));
            }
        }
        System.out.println(pets);




    }
}
