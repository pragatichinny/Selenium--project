package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Custom class: Student
class Student implements Comparable<Student> {
    int rollNo;
    String name;
    int marks;

    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Sort by roll number (ascending)
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.rollNo, other.rollNo);
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name='" + name + '\'' + ", marks=" + marks + '}';
    }
}

public class CustomObjectSortDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Add some students
        students.add(new Student(105, "Alice", 85));
        students.add(new Student(102, "Bob", 92));
        students.add(new Student(108, "Charlie", 78));
        students.add(new Student(101, "Diana", 90));

        // Display before sorting
        System.out.println("Before sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort using Comparable (by rollNo)
        Collections.sort(students);

        // Display after sorting
        System.out.println("\nAfter sorting by roll number:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

