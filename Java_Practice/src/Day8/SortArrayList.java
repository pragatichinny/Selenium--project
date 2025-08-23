package Day8;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(5);
        numbers.add(34);
        numbers.add(23);
        numbers.add(56);

        // Display original list
        System.out.println("Original List: " + numbers);

        // Sort the list in ascending order
        Collections.sort(numbers);

        // Display sorted list
        System.out.println("Sorted List: " + numbers);
    }
}
