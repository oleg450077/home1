package Exercises;

public class Fizz {

    /*
    Write a function, accepts integer argument It should print all the numbers up to the argument BUT:
    if number is multiple of 3, it should print Exercises.Fizz instead of number;
    if number is multiple of 5, it should print Buzz instead of number;
    If it is multiple of both 3 and 5, it should print FizzBuzz instead of number
    Result for 20: 1 2 Exercises.Fizz 4 Buzz Exercises.Fizz 7 8 Exercises.Fizz Buzz 11 Exercises.Fizz 13 14 FizzBuzz 16 17 Exercises.Fizz 19 Buzz
     */

//    static void acceptAndPrint (int num) {

//        for (int i = 1; i<= num; i++){
//
//            if (i%3==0 && i%5==0){
//                System.out.print("FizzBuzz ");
//            }
//            else if (i%3==0){
//                System.out.print("Exercises.Fizz ");
//            }
//            else if (i%5==0){
//                System.out.print("Buzz ");
//            }
//            else {System.out.print(i+ " ");}
//        }
//    }
//    public static void main(String[] args) {
//        acceptAndPrint(20);
//    }


    static void acceptAndPrint (int x){


        for (int i=1; i<=x; i++){
            if (i %5==0 && i%3==0){
                System.out.print(" FizzBuzz ");
            }
            else if (i%5 ==0){
                System.out.print(" Buzz ");
            }
            else if (i%3==0){
                System.out.print(" Exercises.Fizz ");
            }
            else {
                System.out.print(i+" ");
            }
        }

    }

    public static void main(String[] args) {
        int num = 20;
        acceptAndPrint ( num);
    }


    }


