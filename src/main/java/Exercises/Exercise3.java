package Exercises;


//Given an array of integers place the even numbers to the left of 0 and odd numbers to the right of 0
/*
1. for loop
2. arraylist
 */



import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        List<Integer> even = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();

        int [] nums = {1,2,3,4,5,0,6,7,8,9,10};
        for (int i= 0; i<nums.length; i++){
            if (nums[i]%2 == 0){
                even.add(nums[i]);
            }
            else {
                odd.add(nums[i]);
            }

        }

        Collections.sort(even, Collections.reverseOrder());

        System.out.println(even);

        Collections.sort(odd, Collections.reverseOrder());

        System.out.println(odd);

        even.addAll(odd);
        System.out.println(even);

// Solution 2
//        Collections.sort(even);
//        Collections.sort(odd);
//
//        System.out.println(even);
//        System.out.println(even.size());
//        System.out.println(odd);
//
//        List <Integer> resulted = new ArrayList<>();
//
//        for (int i=even.size()-1; i>=0; i--) {
//            resulted.add(even.get(i));
//        }
//        System.out.println(resulted);
//
//        for (int i = 0; i<odd.size(); i++){
//            resulted.add(odd.get(i));
//        }
//        resulted.toArray();
//        System.out.println(resulted);


        String[] stringArray = { "a", "b", "c", "d", "e" };
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
        String[] stringArr = new String[arrayList.size()];
        arrayList.toArray(stringArr);
        for (String s : stringArr)
            System.out.println(s);








}}
