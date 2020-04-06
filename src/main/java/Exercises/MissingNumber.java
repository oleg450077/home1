package Exercises;

public class MissingNumber {
    public static void main(String[] args) {
//        given an array with missing number, find it

        int[] arr= {1,2,3,4,5,6,8};
//
//        int sum = 0;
//        int sum1 = 0;
//
//        for (int i = 0; i<arr.length; i++){
//            sum = sum + arr[i];
//        }
//        for (int j = 0; j<=arr.length+1; j++){
//            sum1 = sum1+ j;
//        }
//
//        System.out.println(sum1-sum);

        System.out.println(arr.length);
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        for (int j=0; j<=arr.length+1; j++){
            sum1=sum1+ j;
        }
        System.out.println(sum1-sum);




    }

}
