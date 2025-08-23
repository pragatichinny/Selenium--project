package Day8;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    // Method to find maximum element in HashSet<Integer>
    public static int getMax(HashSet<Integer> numbers) {
        if(numbers.isEmpty()) {
            throw new IllegalArgumentException("HashSet is empty");
        }
        int max = Integer.MIN_VALUE;
        for(int num : numbers) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // --------- Part 1: HashSet of Strings -----------
        HashSet<String> cities = new HashSet<>();
        
        // Adding 5 cities
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("Sydney");
        
        System.out.println("Original HashSet: " + cities);

        // Trying to add a duplicate
        boolean added = cities.add("Tokyo");
        System.out.println("Trying to add duplicate 'Tokyo': " + added);
        System.out.println("HashSet after attempting duplicate: " + cities);

        // Iterating using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> it = cities.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // Remove an element
        cities.remove("Paris");
        System.out.println("\nHashSet after removing 'Paris': " + cities);

        // Check if a city exists
        System.out.println("Does 'London' exist? " + cities.contains("London"));
        System.out.println("Does 'Paris' exist? " + cities.contains("Paris"));

        // Clear entire HashSet
        cities.clear();
        System.out.println("HashSet after clearing: " + cities);

        // --------- Part 2: Maximum in HashSet<Integer> -----------
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(15);
        numbers.add(42);
        numbers.add(7);
        numbers.add(89);
        numbers.add(30);

        System.out.println("\nHashSet of numbers: " + numbers);
        System.out.println("Maximum element: " + getMax(numbers));
    }
}

