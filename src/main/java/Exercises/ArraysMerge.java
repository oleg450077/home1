package Exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysMerge {

//   public int [] a1 = {1,2,3,4};
//    public int [] a2 = {1,4,11,12};

//    static void mergeIntArrays (int [] a1, int[] a2){
//
//        int len3 = a1.length + a2.length;
//
//        int[] mergedArray = new int[len3];
//        int pos = 0;
//
//        for (int item: a1){
//            mergedArray[pos]= item;
//            pos++;
//        }
//        System.out.println(Arrays.toString(mergedArray));
//        for (int item: a2){
//            mergedArray[pos]= item;
//            pos++;
//        }
//        Arrays.sort(mergedArray);
////        System.out.println(Arrays.binarySearch(a2,11));
//
//        System.out.println(Arrays.toString(mergedArray));
//
//    }
//
//    public static void main(String[] args) {
//        int [] a1 = {1,2,3,4};
//        int [] a2 = {1,4,11,12};
//        mergeIntArrays(a1,a2);
//
//    }

    static void mergeArrays (int[]c, int[]d){
//        int[]mergedArray = new int [a1.length+a2.length];
//        int pos = 0;
//        for (int i=0; i<a1.length; i++){
//            mergedArray[pos]= a1[i];
//            pos=pos+1;
//        }
//
//        for (int j=0; j<a2.length; j++){
//            mergedArray[pos]=a2[j];
//            pos=pos+1;
//        }
//
//         Arrays.sort(mergedArray);
//
//        System.out.println(Arrays.toString(mergedArray));

//        List <Integer> mergedArray = new ArrayList<Integer>();
//
//        for (int i=0; i<c.length; i++) {
//            mergedArray.add(c[i]);
//        }
//
//        for (int j=0; j<d.length; j++){
//            mergedArray.add(d[j]);
//        }
//        System.out.println(mergedArray);

        int [] merged = new int [c.length+d.length];
        for (int i=0; i<c.length; i++){

        }



    }

    public static void main(String[]args){
        int [] a1 = {1,2,3,4, 5, 7, 9, 12, 45};
        int [] a2 = {1,4,11,12};
        mergeArrays(a1,a2);
    }

}
