package Day8;
import java.util.Vector;
import java.util.Enumeration;

public class VectorDemo {

    // Method to calculate sum of elements in a Vector<Integer>
    public static int sumVector(Vector<Integer> vec) {
        int sum = 0;
        for(int num : vec) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        //Vector of integers
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original Vector: " + numbers);

        // Insert an element at 3rd position (index 2)
        numbers.add(2, 25);
        System.out.println("After inserting 25 at index 2: " + numbers);

        // Remove the 2nd element (index 1)
        numbers.remove(1);
        System.out.println("After removing element at index 1: " + numbers);

        // Display elements using Enumeration
        System.out.println("Elements using Enumeration:");
        Enumeration<Integer> en = numbers.elements();
        while(en.hasMoreElements()) {
            System.out.print(en.nextElement() + " ");
        }
        System.out.println("\nSum of elements: " + sumVector(numbers));

        // ----------- Part 2: Vector of Strings -----------
        Vector<String> names = new Vector<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        System.out.println("\nOriginal Names Vector: " + names);

        // Check if a specific name exists
        String searchName = "Bob";
        if(names.contains(searchName)) {
            System.out.println(searchName + " is present in the vector.");
        } else {
            System.out.println(searchName + " is not found.");
        }

        // Replace one name with another
        int index = names.indexOf("Charlie");
        if(index != -1) {
            names.set(index, "Eve");
        }
        System.out.println("After replacing 'Charlie' with 'Eve': " + names);

        // Clear all elements
        names.clear();
        System.out.println("After clearing, Names Vector: " + names);

        // ----------- Part 3: Copy and Compare Vectors -----------
        Vector<Integer> vec1 = new Vector<>();
        vec1.add(1);
        vec1.add(2);
        vec1.add(3);

        Vector<Integer> vec2 = new Vector<>();
        vec2.addAll(vec1); // Copy elements

        System.out.println("\nVector1: " + vec1);
        System.out.println("Vector2 (copied from Vector1): " + vec2);

        if(vec1.equals(vec2)) {
            System.out.println("Both vectors are equal.");
        } else {
            System.out.println("Vectors are not equal.");
        }
    }
}
