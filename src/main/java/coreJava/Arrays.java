package coreJava;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {

        int value = 7;

        int[] values;
        values = new int[3];

        System.out.println(values[0]);

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        for(int i=0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        int[] numbers = {5, 6, 7};

        for(int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

        int [] a = {2,4,6,8,9,4,2,6};
        List <Integer> list = new ArrayList<Integer>();




        String[] stringArray = {"one", "two", "three"};
        List<String> listArray = new ArrayList<String>(java.util.Arrays.asList(stringArray));






}
