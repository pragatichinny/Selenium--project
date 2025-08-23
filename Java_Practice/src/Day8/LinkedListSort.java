package Day8;

import java.util.LinkedList;
import java.util.Collections;

public class LinkedListSort {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(42);
        numbers.add(10);
        numbers.add(75);
        numbers.add(33);
        numbers.add(5);

        System.out.println("Original LinkedList: " + numbers);

        Collections.sort(numbers);

        System.out.println("Sorted LinkedList: " + numbers);
    }
}
