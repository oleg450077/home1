package SortListWithComparators;

import java.util.Comparator;

class ReverseAlphabeticalComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return -s1.compareTo(s2);
    }
}