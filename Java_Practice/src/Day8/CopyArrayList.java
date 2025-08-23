package Day8;

import java.util.ArrayList;

public class CopyArrayList {
    public static void main(String[] args) {
        // Create the first ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Mango");
        list1.add("Orange");

        // Display original list
        System.out.println("Original List 1: " + list1);

        // Create the second ArrayList
        ArrayList<String> list2 = new ArrayList<>();

        // Copy all elements from list1 to list2
        list2.addAll(list1);

        // Display the copied list
        System.out.println("Copied List 2: " + list2);
    }
}
