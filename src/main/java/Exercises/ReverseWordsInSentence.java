package Exercises;

import java.util.Arrays;

public class ReverseWordsInSentence {


    public static void main(String[] args) {
        String str = "Learning Selenium is fun!";

//        System.out.println("First method:");
//        StringBuffer sb = new StringBuffer(str);
//        System.out.println(sb.reverse());
//
//        System.out.println("Second method:");
//        String reverse = "";
//
//        for (int i = str.length()-1; i>=0; i--){
//            reverse = reverse + str.charAt(i);
//        }
//
//        System.out.println(reverse);
        String reverse = "";
        for (int i = str.length()-1; i>=0; i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);




    }

}
