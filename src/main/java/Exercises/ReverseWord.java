package Exercises;

import java.util.Arrays;

public class ReverseWord {



//    static void reverseWord (int index) {
//        int len = str.length();
//        String [] arr = str.split();
//        String element = arr[0];
//        String reversedWord= "";
//        for (int i = element.length()-1; i>=0; i--){
//            reversedWord = reversedWord + element.charAt(i);
//        }
//        arr [0]= element;
//        System.out.println(arr.toString());
//
//
//    }

    public static void main(String[] args) {
        String str = "Selenium is fun";

        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        System.out.println("++++++++++++++++");

        String [] arr = str.split(" ");
        String element = arr[0];
        String reversedWord= "";
        for (int i = element.length()-1; i>=0; i--){
            reversedWord = reversedWord + element.charAt(i);
        }
        arr [0]= reversedWord;
        System.out.println(Arrays.toString(arr));

    }




}
