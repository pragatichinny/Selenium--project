package Day8;

import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetDemo {
    public static void main(String[] args) {
        // -------- Part 1: TreeSet of Strings (natural order) -----------
        TreeSet<String> countries = new TreeSet<>();
        countries.add("India");
        countries.add("Brazil");
        countries.add("Canada");
        countries.add("Australia");
        countries.add("Denmark");

        System.out.println("TreeSet of countries (sorted): " + countries);

        // -------- Part 2: TreeSet of Integers -----------
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(70);
        numbers.add(20);

        System.out.println("\nTreeSet of numbers (sorted): " + numbers);
        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());

        int reference = 30;
        System.out.println("Element lower than " + reference + ": " + numbers.lower(reference));
        System.out.println("Element higher than " + reference + ": " + numbers.higher(reference));

        // -------- Part 3: TreeSet with custom comparator (reverse order) -----------
        TreeSet<String> reverseCountries = new TreeSet<>(Comparator.reverseOrder());
        reverseCountries.add("India");
        reverseCountries.add("Brazil");
        reverseCountries.add("Canada");
        reverseCountries.add("Australia");
        reverseCountries.add("Denmark");

        System.out.println("\nTreeSet of countries (reverse order): " + reverseCountries);
    }
}
