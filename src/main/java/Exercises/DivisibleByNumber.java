package Exercises;

public class DivisibleByNumber {

//    Write a function that accepts integer number and prints:
//    "divisible by 3" if number is divisible by 3,
//    "divisible by 4" if element is divisible by 4,
//    "divisible by 3 and 4" if divisible by 3 and 4

    static void funcAcceptInteger(int number) {
        if (number % 3 == 0 && number % 4 == 0) {
            System.out.println(number + " is divisible by 3 and 4");
        } else if (number % 4 == 0) {
            System.out.println(number + " is divisible by 4");
        } else if (number % 3 == 0) {
            System.out.println(number + " is divisible by 3");
        } else {
            System.out.println(number + " is not divisible by 3 and 4");
        }
    }

        public static void main (String[]args){
            funcAcceptInteger(12);
        }
    }

