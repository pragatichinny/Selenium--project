package Day8;

import java.util.LinkedList;

public class LinkedListInsert {
    public static void main(String[] args) {
        // Create a LinkedList of names
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Display original list
        System.out.println("Original LinkedList: " + names);

        // Insert a name at index 2
        names.add(2, "Eve");

        // Display the updated list
        System.out.println("LinkedList after inserting at index 2: " + names);
    }
}

