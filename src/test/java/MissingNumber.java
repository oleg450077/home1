public class MissingNumber {
    public static void main(String[] args) {
//        given an array with missing number, find it

        int[] arr= {1,2,3,5};
        //15-11=4
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i<arr.length; i++){
            sum =  sum + arr[i];
        }
        for (int j = 0; j<=5; j++){
            sum1= sum1 + j;
        }
        System.out.println("The missing number is :" +(sum1-sum));
    }

}
