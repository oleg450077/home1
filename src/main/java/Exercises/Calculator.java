package Exercises;

import java.util.Scanner;

public class Calculator {

//    public static void main(String[] args) {
////
////        double num1 = 0;
////        double num2 = 0;
////        char operator;
////        double result = 0.0;
////
////        Scanner scan = new Scanner(System.in);
////
////        System.out.println("Enter a number 1:");
////        num1 = scan.nextDouble();
////
////        System.out.println("Enter a number 2:");
////        num2 = scan.nextDouble();
////
////        System.out.println("Enter operator");
////        operator = scan.next().charAt(0);
////
////        switch (operator) {
////            case '+':
////                result = num1 + num2;
////                break;
////            case '-':
////                result = num1 - num2;
////                break;
////            case '/':
////                result = num1 / num2;
////                break;
////            case '*':
////                result = num1 * num2;
////                break;
////            default:
////                System.out.println("Error occured");
////
////        }
////        System.out.println("Result: " + result);
////
////    }

    public static void main(String[]args){

        int result=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = sc.nextInt();
        System.out.println("Enter number");
        int num2 = sc.nextInt();
        System.out.println("Enter operator");
        Character operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;

        }

        System.out.println("Result is : " +result);

        }

}


