package Day8;

import java.util.LinkedList;

public class LinkedListAddFirstLast {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add elements to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Original LinkedList: " + numbers);

        // Add element at the first position
        numbers.addFirst(5);

        // Add element at the last position
        numbers.addLast(40);

        // Display the updated list
        System.out.println("Updated LinkedList after adding first and last elements: " + numbers);
    }
}
