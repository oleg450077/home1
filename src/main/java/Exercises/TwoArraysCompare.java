package Exercises;

import java.lang.reflect.Array;
import java.util.*;

public class TwoArraysCompare {

    //    Compare two arrays with matching times and return {};
//    int[] train1 = {230,300, 330, 400, 430, 400, 445, 500, 600};
//    int [] train2 = {235, 310, 330, 410, 445, 600, 650, 700};

//    private static void getMatchingNumbers() {
//        int[] train1 = {230,300, 330, 400, 430, 400, 445, 500,600};
//        int [] train2 = {235, 310, 330, 410, 445, 600, 650, 700};

//        ArrayList<Integer> match = new ArrayList<>();
////        Map map = new HashMap();
//        for (int i = 0; i < train1.length; i++) {
//            for (int j = 0; j < train2.length; j++) {
//                if (train1[i] == train2[j]) {
//                    match.add(train1[i]);
//                }
//            }
//        }
//        System.out.println(match);
//    }
//
//    public static void main(String[] args) {
//
////        Map map = new HashMap();
////
////        map.put(null, "value for null key");
//            getMatchingNumbers();
//    }

    static void getMatchingTimes(int[] a, int[] b){

        List <Integer> list = new ArrayList<>();

        for (int i=0; i<a.length; i++){
            for (int j = 0; j<b.length; j++){
                if (a[i]==b[j]){
                    list.add(a[i]);

                }
            }
        }
        System.out.println(list);
    }


    public static void main(String[] args) {
        int[] train1 = {230,300, 330, 400, 430, 400, 445, 500, 600};
        int [] train2 = {235, 310, 330, 410, 445, 600, 650, 700, 230};

        getMatchingTimes (train1,train2);

    }


}
