package Exercises;

import java.util.LinkedList;
import java.util.List;

public class Exercises2 {
    public static void main(String[] args) {


        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(90);
        list.add(12);
        System.out.println("Lenght of Linked list is :"+list.size());
        System.out.println("Middle element of Linked List is :" + list.get((list.size()/2)));


    }
}
