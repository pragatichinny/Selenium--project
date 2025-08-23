package Day8;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class QueueDemo {

    // Method to return even numbers from a queue of integers
    public static List<Integer> getEvenNumbers(Queue<Integer> q) {
        List<Integer> evens = new ArrayList<>();
        for (int num : q) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }
        return evens;
    }

    public static void main(String[] args) {
        // --------- Part 1: Bank Queue Simulation -----------
        Queue<String> bankQueue = new LinkedList<>();
        bankQueue.add("Alice");
        bankQueue.add("Bob");
        bankQueue.add("Charlie");
        bankQueue.add("David");
        bankQueue.add("Eve");

        System.out.println("Initial Bank Queue: " + bankQueue);

        while (!bankQueue.isEmpty()) {
            String servedCustomer = bankQueue.poll(); // serve customer
            System.out.println("Served: " + servedCustomer);
            System.out.println("Remaining Queue: " + bankQueue);
        }

        // --------- Part 2: Task Manager -----------
        Queue<String> tasks = new LinkedList<>();
        tasks.add("Email client");
        tasks.add("Prepare report");
        tasks.add("Team meeting");
        tasks.add("Code review");

        System.out.println("\nTask Queue: " + tasks);
        System.out.println("Next task to do: " + tasks.peek()); // peek

        while (!tasks.isEmpty()) {
            String completedTask = tasks.poll();
            System.out.println("Completed Task: " + completedTask);
            System.out.println("Remaining Tasks: " + tasks);
        }

        // --------- Part 3: Even Numbers from Integer Queue -----------
        Queue<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(33);
        numbers.add(42);

        List<Integer> evenNumbers = getEvenNumbers(numbers);
        System.out.println("\nEven numbers from queue: " + evenNumbers);
    }
}
