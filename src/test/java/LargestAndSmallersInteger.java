import java.util.Arrays;

public class LargestAndSmallersInteger {

    public static void main(String[] args) {

//        find the smallest and Larges elements of array
        int [] numbers = {10, -87, 23, 3, 868, 543543, 779779, -190};
        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i<numbers.length; i++){
            if (numbers[i]> largest){
                largest = numbers[i];
            }else if (numbers[i]<smallest){
                smallest= numbers[i];

            }
        }
        System.out.println("The initial array is :" + Arrays.toString(numbers));
        System.out.println("The largest number is :" + largest);
        System.out.println("The smallest number is :" + smallest);

    }


}
