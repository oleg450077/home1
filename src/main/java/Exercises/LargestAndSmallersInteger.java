package Exercises;

import java.util.Arrays;

public class LargestAndSmallersInteger {

    public static void main(String[] args) {

//        find the smallest and largest elements of array
//        int [] numbers = {10, -87, 23, 3, 868, 543543, 779779, -190};

//        int sm = numbers[0];
//        int lg = numbers[0];
//        for (int i = 1; i<numbers.length; i++){
//            if (numbers[i] > lg){
//                lg =  numbers[i];
//            }
//            else if (numbers[i]<sm){
//                sm= numbers[i];
//            }
//        }
//        System.out.println(lg);
//        System.out.println(sm);

        int [] numbers = {10, -87, 23, 3, 868, 543543, 779779, -190};

        int smallest = 0;
        int largest = 0;

        for (int i =0; i< numbers.length; i++){
           if (numbers[i]< smallest){
               smallest=numbers[i];
           }
           else if (numbers[i]>largest){
               largest=numbers[i];
           }
        }

        System.out.println(smallest);
        System.out.println(largest);








    }


}
