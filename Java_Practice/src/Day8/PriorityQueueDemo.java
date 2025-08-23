package Day8;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Queue;

class Patient {
    String name;
    int severityLevel;

    public Patient(String name, int severityLevel) {
        this.name = name;
        this.severityLevel = severityLevel;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severityLevel + ")";
    }
}

class PrintJob {
    String jobName;
    int priority;

    public PrintJob(String jobName, int priority) {
        this.jobName = jobName;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return jobName + " (Priority: " + priority + ")";
    }
}

public class PriorityQueueDemo {

    // Method to merge two PriorityQueues of integers
    public static PriorityQueue<Integer> mergeQueues(PriorityQueue<Integer> q1, PriorityQueue<Integer> q2) {
        PriorityQueue<Integer> merged = new PriorityQueue<>();
        merged.addAll(q1);
        merged.addAll(q2);
        return merged;
    }

    public static void main(String[] args) {
        // -------- Part 1: Hospital Emergency Queue -----------
        PriorityQueue<Patient> hospitalQueue = new PriorityQueue<>(Comparator.comparingInt(p -> -p.severityLevel)); // max severity first

        hospitalQueue.add(new Patient("Alice", 5));
        hospitalQueue.add(new Patient("Bob", 8));
        hospitalQueue.add(new Patient("Charlie", 3));
        hospitalQueue.add(new Patient("David", 10));

        System.out.println("Hospital Emergency Queue:");
        while (!hospitalQueue.isEmpty()) {
            System.out.println("Serving: " + hospitalQueue.poll());
        }

        // -------- Part 2: Print Jobs Priority -----------
        PriorityQueue<PrintJob> printQueue = new PriorityQueue<>(Comparator.comparingInt(p -> -p.priority)); // high priority first
        printQueue.add(new PrintJob("Document1", 2));
        printQueue.add(new PrintJob("Report", 5));
        printQueue.add(new PrintJob("Invoice", 3));
        printQueue.add(new PrintJob("Presentation", 4));

        System.out.println("\nPrint Jobs Queue:");
        while (!printQueue.isEmpty()) {
            System.out.println("Printing: " + printQueue.poll());
        }

        // -------- Part 3: Merge Two PriorityQueues of Integers -----------
        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        queue1.add(5);
        queue1.add(10);
        queue1.add(3);

        PriorityQueue<Integer> queue2 = new PriorityQueue<>();
        queue2.add(7);
        queue2.add(1);
        queue2.add(8);

        PriorityQueue<Integer> mergedQueue = mergeQueues(queue1, queue2);
        System.out.println("\nMerged and Sorted Integer Queue:");
        while (!mergedQueue.isEmpty()) {
            System.out.print(mergedQueue.poll() + " ");
        }
    }
}
