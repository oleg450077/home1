package Exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PrintAllIntegerArray {

    static void printSortedIntArray(int[] arr){
        ArrayList <Integer> a = new ArrayList<Integer>();
        for (int num : arr){
            a.add(num); }
        Collections.sort(a);
        System.out.println(a);
    }

    public static void main(String[] args) {
        int[] ar = {1,99,4,77,7,89};
        printSortedIntArray(ar);

    }

}
