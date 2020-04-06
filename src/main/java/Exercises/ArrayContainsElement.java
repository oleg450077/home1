package Exercises;

import java.util.Arrays;

public class ArrayContainsElement {

//    static int[] arr = {1, 4, 2, 5, 7, 8, 4, 5};
//    static String[] array = {"volga", "dnepr", "themsa"};
//
//    static void checkContainsElement(int[] a, String[] b, String word, int num) {
//        int counter = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (num == arr[i]) {
//                counter = counter + i;
//                System.out.println("This array contains the "+counter+"th index: " + num);
//            }
//
//        }
//        System.out.println(Arrays.toString(arr).contains("8"));
//
//        for (String el : array) {
//            if (word == el) {
//                System.out.println("This array contains the word: " + word);
//            }
//        }
//    }
//    public static void main(String[] args) {
//
//        checkContainsElement(arr, array, "dnepr", 4);
//    }

    static int[] arr = {1, 4, 2, 5, 7, 8, 4, 5};
    static String[] array = {"volga", "dnepr", "themsa", "dnepr"};

    static void arrayContainsElement (int[]arr, String[] array, int x, String text){
            int counter1 = 0;
            int counter2 = 0;

        for (int i = 0; i<arr.length; i++){
            if (arr[i]== x){
                counter1 = counter1+1;
                System.out.println("The number "+ x +" exists " + counter1 +" time at: " + i+ " position");
            }
        }
//        System.out.println("The number" +x+ " not found" );

        for (int j = 0; j<array.length; j++){
            if (array[j]==text){
                counter2 = counter2+1;
                System.out.println("The string: "+ text +" exist "+counter2+" time at: " + j+ " position");
            }

//                System.out.println("The string" +text+ " not found" );

        }

    }

    public static void main (String[]args){

        arrayContainsElement(arr, array, 5, "dnepr");
    }

}
