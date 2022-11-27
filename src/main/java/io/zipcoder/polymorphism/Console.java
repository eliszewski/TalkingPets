package io.zipcoder.polymorphism;

import java.util.Scanner;

public class Console {
    Scanner scanner = new Scanner(System.in);
    public String returnANameFromUserForPet(int counter){
        System.out.println("Enter a pet name for pet: " + (counter));
        return scanner.nextLine();
    }
    public String returnATypeFromUserForPet(int counter){
        System.out.println("Types of Pets: Cat | Dog | Guinea Pig ");
        System.out.println("Enter a pet type for pet " + counter);
        return scanner.nextLine();
    }
}
