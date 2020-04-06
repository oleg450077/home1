package Exercises;

public class DivisibleByTwoAndFive {

//    Write a function that accepts integer number and prints:
//            "divisible by 2" if number is divisible by 2
//            "divisible by 5" if element is divisible by 5

    static void divisibleByTwoAndFive ( int number){
        if (number % 2 ==0 && number % 5 ==0){
            System.out.println("divisible by 2 and 5");
        }
        else if (number % 5 ==0){
            System.out.println("divisible by 5");
        }
        else if (number % 2 ==0){
            System.out.println("divisible by 2");}
        else {
            System.out.println("not divisible by 2 and 5");
        }
    }

    public static void main(String[] args) {

        divisibleByTwoAndFive(775);
    }


}
