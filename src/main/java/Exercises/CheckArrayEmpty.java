package Exercises;

import java.util.Arrays;

public class CheckArrayEmpty {


    static void isEmptyArray(int[] a1, String[] a2) {
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2).isEmpty());
    }


    public static void main(String[] args) {
         int[] arr = {3,5,7};
         String[] array={"Don", "Volga"};

         isEmptyArray(arr, array);

    }

}
