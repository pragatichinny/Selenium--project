package Day8;

import java.util.LinkedList;

public class LinkedListRemove {
    public static void main(String[] args) {
        // Create a LinkedList of animal names
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Giraffe");
        animals.add("Zebra");

        // Display original list
        System.out.println("Original LinkedList: " + animals);

        // Remove the first element
        animals.removeFirst();
        System.out.println("After removing first element: " + animals);

        // Remove the last element
        animals.removeLast();
        System.out.println("After removing last element: " + animals);

        // Remove a specific element by value
        animals.remove("Elephant");
        System.out.println("After removing 'Elephant': " + animals);
    }
}
