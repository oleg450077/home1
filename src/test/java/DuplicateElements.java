import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateElements {
    public static void main(String[] args) {

//        find duplicate elements in array
        String[] names = {"Java", "Ruby", "Python", "C++", "JavaScript", "Java"};
// solution 1

        for (int i = 0; i < names.length; i++) {
            for (int j = i+1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("duplicate is :" +names[i]);
                }
            }
        }
        System.out.println("*************");
// Solution 2
        Set<String> store = new HashSet<String>();
        for (String name : names){
            if (store.add(name) == false){
                System.out.println("Duplicate is :" + name);
            }
        }

//        Set <String> tree_set= new TreeSet<String>(store);
//        System.out.println(tree_set);

    }}

