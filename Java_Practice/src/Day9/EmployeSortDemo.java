package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Employee class implementing Comparable
class Employee implements Comparable<Employee> {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Compare employees by name alphabetically
    @Override
    public int compareTo(Employee other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
    }
}

public class EmployeSortDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Add employees
        employees.add(new Employee(101, "John", 50000));
        employees.add(new Employee(102, "Alice", 60000));
        employees.add(new Employee(103, "Bob", 55000));
        employees.add(new Employee(104, "Diana", 70000));

        // Display before sorting
        System.out.println("Before sorting:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sort employees by name
        Collections.sort(employees);

        // Display after sorting
        System.out.println("\nAfter sorting by name:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
