package Day8;
import java.util.ArrayList;

public class ClearArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Display original list
        System.out.println("Original List: " + numbers);

        // Remove all elements
        numbers.clear();

        // Display size of the list
        System.out.println("All elements removed.");
        System.out.println("Size of List after clear(): " + numbers.size());
    }
}
