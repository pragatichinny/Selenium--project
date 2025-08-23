package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class StringLengthSort {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Kiwi");
        strings.add("Strawberry");
        strings.add("Mango");

        System.out.println("Original List:");
        for (String s : strings) {
            System.out.println(s);
        }

        // Sort using anonymous inner class
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        System.out.println("\nSorted List by Length:");
        for (String s : strings) {
            System.out.println(s);
        }
    }
}

