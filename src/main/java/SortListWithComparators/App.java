package SortListWithComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {


    public static void main(String[] args) {

        ////////////////////// Sorting Strings ////////////////////////////////
        List<String> animals = new ArrayList<String>();

        animals.add("tiger");
        animals.add("lion");
        animals.add("cat");
        animals.add("snake");
        animals.add("mongoose");
        animals.add("elephant");

        // Collections.sort(animals, new StringLengthComparator());
        Collections.sort(animals, new ReverseAlphabeticalComparator());

        for(String animal: animals) {
            System.out.println(animal);
        }

        ////////////////////// Sorting Numbers ////////////////////////////////
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(3);
        numbers.add(36);
        numbers.add(73);
        numbers.add(40);
        numbers.add(1);

        Collections.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                return -num1.compareTo(num2);
            }
        });

        for(Integer number: numbers) {
            System.out.println(number);
        }

        ////////////////////// Sorting arbitary objects ////////////////////////////////

        List<Person> people = new ArrayList<Person>();

        people.add(new Person(1, "Joe"));
        people.add(new Person(3, "Bob"));
        people.add(new Person(4, "Clare"));
        people.add(new Person(2, "Sue"));

        // Sort in order of ID
        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {

                if(p1.getId() > p2.getId()) {
                    return 1;
                }
                else if(p1.getId() < p2.getId()) {
                    return -1;
                }

                return 0;
            }
        });

        for(Person person: people) {
            System.out.println(person);
        }

        System.out.println("n");
        // Sort in order of name
        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        for(Person person: people) {
            System.out.println(person);
        }

    }

}
