package Package1;

public class Student {
	String Name = "Pragati";
	int Rollno = 512;
	Float Percentage = 85.2f;
	short Age = 20;
	String Course = "Java Selenimun";
	int Batch = 8;
	public static void main(String[] args) {
			Student stud = new Student();
			System.out.println("Name:" + stud.Name);
			System.out.println("Rollno:" + stud.Rollno);
			System.out.println("Percentage:" + stud.Percentage);
			System.out.println("Age:" + stud.Age);
			System.out.println("Course:" + stud.Course);
			System.out.println("Batch:" + stud.Batch);
	}

}
