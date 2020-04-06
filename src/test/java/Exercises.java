import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Exercises {
    public static void main(String[]args){

        List<String> list = List.of("plum", "apple", "kiwi");
        System.out.println(list);
        System.out.println(list.contains("apple"));

        System.out.println("*********");

        List arrList = new java.util.ArrayList(List.of(3, 9, 14, 8, 3, 10));
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
