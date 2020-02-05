import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[]args){

        List<String> list = List.of("plum", "apple", "kiwi");
        System.out.println(list);
        System.out.println(list.contains("apple"));

        List arrList = List.of(3,9,14,8,3,10);
        for (Object element : arrList) {
            System.out.println(element); }


    }

}
