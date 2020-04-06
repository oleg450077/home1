package Exercises;

import java.util.*;

public class Exercises {
    public static void main(String[]args){

        List<String> list = new ArrayList<String>(List.of("plum", "apple", "kiwi"));
        list.add(1,"grapes");
        System.out.println(list);
        System.out.println(list.contains("apple"));

        System.out.println("*********");

        List arrList = new ArrayList(List.of(3, 9, 14, 8, 3, 10));
        List arrList1 = List.of(2,4,5,6,7,8);
        System.out.println(arrList1);
        System.out.println(arrList.get(3));
        arrList.add(4,45);
        for (Object element : arrList) {
            System.out.println(element); }

        HashMap<String, String> map = new HashMap<>();
        map.put("usa","washington");
        map.put("russia", "moscow");
        System.out.println(map);
        map.put("usa", "newyork");
        System.out.println(map);


        }

    }


