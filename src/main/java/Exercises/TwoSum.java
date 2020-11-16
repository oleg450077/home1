package Exercises;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
//
public class TwoSum {
//
//    /*
//    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//Example: Given nums = [2, 7, 11, 15], target = 9, Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
//     */
//
//    public static List<Integer> twoSum(int[] nums, int target) {
//
//        for (int i = 0; i <= nums.length; i++) {
//
//            for (int j = 1; j <= nums.length; j++) {
//
//                if (nums[i] + nums[j] == target) {
//
//                    return Arrays.asList(i, j);
//
//                }
//            }
//        }
//
//
//        public static void main (String[] args){
//            List <Integer> result = twoSum(new int[]{2, 7, 11, 15}, 9);
//            System.out.println(result);
//        }
//    }
//}
//     static void twoSum(int[] arr, int target){
//
//         for (int i=0; i<arr.length; i++){
//             for (int j=i+1; j<arr.length; j++){
//                 if (arr[i]+ arr[j] == target){
//                     System.out.println(Arrays.asList(i,j));
//                 }
//             }
//         }
//
//    }
//
//public static void main(String[] args) {
//    int [] nums = {2, 4, 6, 8, 5, 14, 5};
//    twoSum (nums, 10);
//}

    public static void main(String[] args) {
        int[]numbers={2,6,7,3,8,11};
        getIndexes(numbers,9);

    }

    public static void getIndexes (int[]num, int target){
        for (int i = 0; i< num.length; i++){
            for (int j=i+1; j<num.length; j++){
                if (num[i]+num[j] == target){
                    System.out.println(Arrays.asList(i,j));
                }
            }
        }
    }

}