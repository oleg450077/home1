package Exercises;

import java.util.*;

public class SortTreeSet {

    public static void main(String args[]) {
        int a[] = {77, 23, 4, 66, 99, 112, 45, 56, 39, 89};

        List<Integer> list = new ArrayList<>();
        for (int item=0; item<a.length; item++){
            list.add(a[item]);
        }
        Collections.sort(list);
        System.out.println(list);
//        Set<Integer> s = new HashSet<Integer>();
//        try {
//            for(int i = 0; i <a.length; i++) {
//                s.add(a[i]);
//            }
//            System.out.println(s);
//            TreeSet sorted = new TreeSet<Integer>(s);
//            System.out.println("Sorted list = ");
//            System.out.println(sorted);
//        }
//        catch(Exception e) {}
//    }

//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < a.length; i++) {
//            list.add(a[i]);
//        }
//        Collections.sort(list);
//        System.out.println(list);
//    }

        Set<Integer> sorted = new TreeSet<Integer>();
        for (int i=0; i<a.length; i++){
            sorted.add(a[i]);
        }
        System.out.println(sorted);





}}
