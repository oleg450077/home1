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

//    public static void main(String[] args) {
//        String str = "Selenium is fun";
//
//        StringBuffer sb = new StringBuffer(str);
//        System.out.println(sb.reverse());
//
//        System.out.println("++++++++++++++++");
//
//        String [] arr = str.split(" ");
//        String element = arr[0];
//        String reversedWord= "";
//        for (int i = element.length()-1; i>=0; i--){
//            reversedWord = reversedWord + element.charAt(i);
//        }
//        arr [0]= reversedWord;
//        System.out.println(Arrays.toString(arr));

    public static void main(String[] args) {
        String str = "QA Automation Engineer needed";
        String reversed="";
        for (int i = str.length()-1; i>=0; i--){
            reversed= reversed + str.charAt(i);
        }
        System.out.println(reversed);

        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        int num = 123456789;
//        String strNum = Integer.toString(num);

        StringBuffer stringBuffer = new StringBuffer(Integer.toString(num));
        System.out.println(stringBuffer.reverse());

    }




}
