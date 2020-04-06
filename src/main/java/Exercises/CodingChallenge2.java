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
import java.util.TreeMap;

public class CodingChallenge2 {

    public static Map <String, Integer> culculateClicksByDomain(String[] arr) {


        int sum = 0, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0;

        Map <String, Integer> map = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {

            String[] arr1 = arr[i].split(",");

            int number = Integer.parseInt(arr1[0]);

            String domain = arr1[1];
            map.put(arr1[1], number);

        }
        System.out.println(map);

        for (String j : map.keySet()){
            if (j.contains("com")){

                sum=sum+map.get(j);
                System.out.println(j +"   :"+ map.get(j));
            }
            else if (j.contains("org")){
                sum1=sum1+map.get(j);
                System.out.println(j +"   :"+ map.get(j));
            }
            else if (j.contains("sports")){
                sum2=sum2+map.get(j);
                System.out.println(j +"   :"+ map.get(j));
            }
            else if (j.contains("uk")){
                sum3=sum3+map.get(j);
                System.out.println(j +"   :"+ map.get(j));
            }
        }
        System.out.println("com    :" + sum);
        System.out.println("org    :" + sum1);
        System.out.println("sports    :" + sum2);
        System.out.println("uk    :" + sum3);


        return map;
    }


    public static void main(String[] args) {
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


