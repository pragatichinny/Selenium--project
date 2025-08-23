package Day8;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeDemo {

    // ---------- Part 1: Palindrome Checker ----------
    public static boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    // ---------- Part 2: Double-ended Order System ----------
    public static void doubleEndedOrderSystem() {
        Deque<String> orders = new ArrayDeque<>();
        System.out.println("\n--- Double-ended Order System ---");

        // Add items at front and rear
        orders.addFirst("Burger");
        orders.addLast("Pizza");
        orders.addFirst("Sushi");
        orders.addLast("Pasta");

        System.out.println("After adding items: " + orders);

        // Remove items from both ends
        orders.removeFirst();
        System.out.println("After removing from front: " + orders);

        orders.removeLast();
        System.out.println("After removing from rear: " + orders);
    }

    // ---------- Part 3: Browser History Simulation ----------
    public static void browserHistorySimulation() {
        Deque<String> backStack = new ArrayDeque<>();
        Deque<String> forwardStack = new ArrayDeque<>();

        System.out.println("\n--- Browser History Simulation ---");

        // Visiting pages
        backStack.push("google.com");
        backStack.push("openai.com");
        backStack.push("stackoverflow.com");

        System.out.println("Current page: " + backStack.peek());

        // Go back
        forwardStack.push(backStack.pop());
        System.out.println("After going back, current page: " + backStack.peek());

        // Go back again
        forwardStack.push(backStack.pop());
        System.out.println("After going back again, current page: " + backStack.peek());

        // Go forward
        backStack.push(forwardStack.pop());
        System.out.println("After going forward, current page: " + backStack.peek());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Palindrome Checker
        System.out.print("Enter a string to check palindrome: ");
        String input = sc.nextLine();
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        // Double-ended Order System
        doubleEndedOrderSystem();

        // Browser History Simulation
        browserHistorySimulation();

        sc.close();
    }
}
