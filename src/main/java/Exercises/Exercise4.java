package Exercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise4 {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("Volga");
        list.add("Don");
        list.add("Oka");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
