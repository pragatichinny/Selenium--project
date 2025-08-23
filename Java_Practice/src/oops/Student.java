package oops;

public class Student {
	void details(int rollno,String name,float per) {
		System.out.println("Rollno="+rollno);
		System.out.println("Name="+name);
		System.out.println("Percentage="+per);
	}
	static void show(int a) {
		System.out.println(a);
		System.out.println("hello");
	}
	static {
		System.out.println("hi iam block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud=new Student();
		stud.details(1, "pragati", 98.8f);
		System.out.println(stud);
		show(40);

	}

}
