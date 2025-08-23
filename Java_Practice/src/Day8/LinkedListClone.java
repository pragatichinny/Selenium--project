package Day8;

import java.util.LinkedList;

public class LinkedListClone {
    public static void main(String[] args) {
        LinkedList<Integer> original = new LinkedList<>();
        original.add(1);
        original.add(2);
        original.add(3);
        original.add(4);

        // Clone the list
        @SuppressWarnings("unchecked")
        LinkedList<Integer> cloned = (LinkedList<Integer>) original.clone();

        System.out.println("Original LinkedList: " + original);
        System.out.println("Cloned LinkedList: " + cloned);
    }
}

