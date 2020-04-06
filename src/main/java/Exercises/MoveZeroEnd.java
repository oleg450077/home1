package Exercises;


import java.util.Arrays;

public class MoveZeroEnd {
    /*
    Given I have an array of numbers (positive, negative and zeros) I want to move all the zero's to the end of array while maintaing the relative order of the elements
int [] arr = {1,2,3,0,0,4,6,0};
int [] output = {1,2,3,4,6,0,0,0}
int [] arr = {0,2,1,0,0,7,6,0};
int [] output = {2,1,7,6,0,0,0,0}
     */

//    static void moveZeros(int[] nums) {
//
//
//        for(int j= 0; j<nums.length;j++){
//        for (int i = 0; i <nums.length-1; i++) {
//            if (nums[i] != 0) {
//                nums[i]=nums[i];
//            }
//            else if (nums[i] == 0){
//                int a = nums[i];
//                nums[i]=nums[i+1];
//                nums[i+1]= a;
//            }
//        }
//    }
//        System.out.println(Arrays.toString(nums));
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 0, 0,0, 4, 6, 0};
////        int [] arr = {0,2,1,0,0,7,6,0};
////        int [] arr = {0,0,1,0};
////        int[] arr = {-1,0,-4,6,0};
////          int[] arr = {1};
////          int[] arr = {0};
////        int [] arr = {};
//
//        moveZeros(arr);
//    }

    static void moveZerosToEnd(int[]array){

        int a=0;
        for (int j=0; j<array.length; j++){
        for (int i = 0; i<array.length-1; i++){
            if (array[i]!=0){
                continue;
            }
            else if (array[i]==0){
                a= array[i];
                array[i]=array[i+1];
                array[i+1]= a;
            }
        }

    }
        System.out.println(Arrays.toString(array));}

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 0, 0, 0, 4, 6, 0};
        moveZerosToEnd(arr);
    }
}








