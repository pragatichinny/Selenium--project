package Day7;
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentDemo {
    public static void updateMarks(Student s, int newMarks) {
        s.marks = newMarks;
    }

    public static void main(String[] args) {
        Student student = new Student("Alice", 85);
        System.out.println("Before update: " + student.name + " - " + student.marks);
        updateMarks(student, 95);
        System.out.println("After update: " + student.name + " - " + student.marks);
    }
}
