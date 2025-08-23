package Day8;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of characters
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');
        chars.add('E');

        // Display original list
        System.out.println("Original List: " + chars);

        // Reverse the list
        Collections.reverse(chars);

        // Display reversed list
        System.out.println("Reversed List: " + chars);
    }
}

