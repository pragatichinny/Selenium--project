package Day8;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSearch {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Ask user for input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int num = sc.nextInt();

        // Check if the number exists in the list
        if (numbers.contains(num)) {
            System.out.println(num + " exists in the list.");
        } else {
            System.out.println(num + " does not exist in the list.");
        }

        sc.close();
    }
}

