import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortTreeSet {

    public static void main(String args[]) {
        int a[] = {77, 23,39, 4, 66, 99, 112, 45,66, 56, 39, 89};
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
        Set <Integer> set = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++){
            set.add(a[i]);
        }
        System.out.println("This is unsorted set: "+ set);
        TreeSet <Integer> sortedSet = new TreeSet<>(set);
        System.out.println("This is sorted set: " + sortedSet);

    }

}
