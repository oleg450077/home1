package Exercises;

/*
    counts= [
    "900,google.com",
    "60,mail.yahoo.com",
    "10,mobile.sports.yahoo.com",
    "40,sports.yahoo.com",
    "300,yahoo.com",
    "10,stackoverflow.com",
    "20,overflow.com",
    "2,en.wikipedia.org",
    "1,m.wikipedia.org",
    "1,mobile.sports",
    "1,google.co.uk"]

 */

import java.util.Arrays;
import java.util.Map;

public class CodingChelange {

    public static void culculateClicksByDomain(String[] arr) {


        int sum = 0, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0;

            for (int i = 0; i < arr.length; i++) {
                String[] arr1 = arr[i].split(",");
//            System.out.println(Arrays.toString(arr1));
                int number = Integer.parseInt(arr1[0]);
//            System.out.println(number);
                String domain = arr1[1];
                if (domain.contains("com")) {
                    sum = sum + number;
                } else if (domain.contains("org")) {
                    sum1 = sum1 + number;
                } else if (domain.contains("sports")) {
                    sum2 = sum2 + number;
                } else if (domain.contains("uk")) {
                    sum3 = sum3 + number;
                } else if (domain.contains("yahoo")) {
                    sum4 = sum4 + number;
                }
            }
            System.out.println("com : " + sum);
            System.out.println("org :" + sum1);
            System.out.println("sports :" + sum2);
            System.out.println("uk :" + sum3);
            System.out.println("yahoo.com :" + sum4);
        }



        public static void main (String[]args){
            String[] counts = {
                    "900,google.com",
                    "60,mail.yahoo.com",
                    "10,mobile.sports.yahoo.com",
                    "40,sports.yahoo.com",
                    "300,yahoo.com",
                    "10,stackoverflow.com",
                    "20,overflow.com",
                    "2,en.wikipedia.org",
                    "1,m.wikipedia.org",
                    "1,mobile.sports",
                    "1,google.co.uk"};

            culculateClicksByDomain(counts);

        }
    }

