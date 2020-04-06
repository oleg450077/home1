package Exercises;

public class PrintAllNumbers {

//    Write a function that prints all numbers from 0 up to n, and supports also negative numbers

    static void funcPrintAllNumbers(int number) {

        if (number > 0) {
            for (int i = 0; i <= number; i++) {
                System.out.println(i); }
        }
        else if (number < 0) {
                for (int i =0; i>=number; i--) {
                    System.out.println(i);
                }
            }
        else System.out.println("zero");
        }


    public static void main(String[] args) {
        funcPrintAllNumbers(0);
    }


}
