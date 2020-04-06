package coreJava;

import java.util.Scanner;

public class GetUserInput {

    public static void main(String[] args) {

        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Output the prompt
        System.out.println("Enter a floating point value: ");

        // Wait for the user to enter something.
        double value = input.nextDouble();

        // Tell them what they entered.
        System.out.println("You entered: " + value);

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter whole number");
//        int number = input.nextInt();
//        System.out.println("you entered " + number);


    }

}
