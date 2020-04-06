package Exercises;

public class PrimeNumberCheck {
//    Write a function that verifies if number is prime, Prime is a number that can not be made by multiplying 2 whole numbers

        static void checkPrimeNumber (int num){

            if (num<2 ){
                System.out.println(num + " is not a prime number");
            }
            else if (num % 2 != 0 && num / num ==1){
                System.out.println(num + " is a Prime number");
            }
            else {
                System.out.println(num + " is not a prime number");
            }
        }
    public static void main(String[] args) {
        checkPrimeNumber(2);
    }

}
