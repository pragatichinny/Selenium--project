package Day8;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListSearch {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to search: ");
        String input = sc.nextLine();

        if(list.contains(input)) {
            System.out.println(input + " is found in the LinkedList.");
        } else {
            System.out.println(input + " is NOT found in the LinkedList.");
        }
        sc.close();
    }
}

