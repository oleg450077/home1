package Exercises;

import java.util.Arrays;

public class SwapTwoArrayElem {

//    Write a function that swaps two array elements – 3rd and 5th

//    public static void main(String[] args) {
//        int [] arr = {5,2,9,7,3};
//        System.out.println("Array before the swap:" + Arrays.toString(arr));
//        int a = arr[2];
//        int b = arr[4];
//        arr[2]=b;
//        arr[4]=a;
//        System.out.println("Array after the swap:" + Arrays.toString(arr));
//
//    }

    static void swapTwoArrayElements(int [] array, int index1, int index2){

        int temp = 0;
        temp = array[index1];
        array[index1]= array[index2];
        array[index2]=temp;
        System.out.println(Arrays.toString(array));


    }

    public static void main(String[] args) {
        int [] arr = {1,3,5,7,4,6,11,9, 87};
        int [] arr1 = new int[]{3,5,6,7};
        swapTwoArrayElements(arr, 3,5);
        swapTwoArrayElements(arr1, 1,2);
    }


}
