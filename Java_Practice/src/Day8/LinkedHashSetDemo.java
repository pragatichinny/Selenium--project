package Day8;

import java.util.LinkedHashSet;
import java.util.Iterator;

// Custom Student class
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals and hashCode to handle duplicates
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return this.id == other.id && this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return id * 31 + name.hashCode();
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // --------- Part 1: LinkedHashSet of Integers -----------
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(5); // duplicate, will not be added

        System.out.println("LinkedHashSet of numbers (preserves insertion order): " + numbers);

        // --------- Part 2: LinkedHashSet of Custom Objects -----------
        LinkedHashSet<Student> students = new LinkedHashSet<>();
        students.add(new Student(101, "Alice"));
        students.add(new Student(102, "Bob"));
        students.add(new Student(103, "Charlie"));

        // Try adding a duplicate
        boolean added = students.add(new Student(102, "Bob"));
        System.out.println("\nTrying to add duplicate student: " + added);

        System.out.println("LinkedHashSet of students:");
        for (Student s : students) {
            System.out.println(s);
        }

        // --------- Part 3: Merging two LinkedHashSets -----------
        LinkedHashSet<Integer> moreNumbers = new LinkedHashSet<>();
        moreNumbers.add(25);
        moreNumbers.add(5); // already exists in first set
        moreNumbers.add(30);

        numbers.addAll(moreNumbers); // merge sets
        System.out.println("\nMerged LinkedHashSet of numbers: " + numbers);
    }
}
