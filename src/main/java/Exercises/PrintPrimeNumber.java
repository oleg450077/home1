package Exercises;

public class PrintPrimeNumber {

    /*
    Write a function that prints all prime numbers up to the number
    Prime numbers are divisible only by the number 1 or itself. For example, 2, 3, 5, 7 and 11 are the first few prime numbers
     */

    static void printPrimeNumbers (int num) {
        for (int i = 2; i <= num; i++) {
            if (i % 1 == 0 || i % i == 0) {
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {

        printPrimeNumbers(11);
    }

}
