package Day8;
import java.util.ArrayList;
import java.util.Scanner;

public class Remove_element {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Display initial list
        System.out.println("Fruits List: " + fruits);

        // Ask user for fruit to remove
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fruit to remove: ");
        String fruitToRemove = sc.nextLine();

        // Remove the fruit
        if(fruits.remove(fruitToRemove)) {
            System.out.println(fruitToRemove + " removed successfully.");
        } else {
            System.out.println(fruitToRemove + " not found in the list.");
        }

        // Display updated list
        System.out.println("Updated Fruits List: " + fruits);

        sc.close();
    }
}

