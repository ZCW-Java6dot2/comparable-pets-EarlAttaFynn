package io.zipcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Display {

    public void getInput() {
        int numOfPets;
        int critter = 1;
        String current = "";
        Scanner input = new Scanner(System.in);
        String currentType = "";

        System.out.println("Hello, tell me how many pets you have in digit form.");
        numOfPets = Integer.parseInt(input.nextLine());
        List<String> nameOfPets = new ArrayList<>(numOfPets);
        System.out.println("Cool, tell me about these critters.\nBtw I only care about dogs, cats, and parrots. So...");

        //for (int i = 1; i <= numOfPets; i++)
        while (numOfPets > 0) {
            System.out.println("What's the name of critter number " + critter + " ?");
            //input.nextLine();
            current = input.nextLine().trim();
            System.out.println("Ok, and " + current + " is a...?" );
            currentType = input.nextLine().trim();
            System.out.println("Cool!");
            nameOfPets.add(current + " the " + currentType);
            current = "";
            currentType ="";
            critter++;
            numOfPets--;
            if(numOfPets == 0) {
                System.out.println("So to recap, we have:\n");
                for (String s : nameOfPets) {
                    System.out.println(s + "\n");
                }
            }
        }



    }
}
