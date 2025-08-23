package variables;

public class Variable_test {
	int a=10;            //instance or global variable
	void show()       // allocate memory for variable 'a'
	{
	System.out.println(a);
	}
	
	void show1(int b, int c)       //Local variable
	{    
		int sum= b+c;
		System.out.println(sum);
	}
	
	int rollno,age;
	float per;
	String name;
	static String collegename="XYZ";   //Static variable(common for every student)
	void details(int rollno1, int age1, String name1, float per1) {
		rollno=rollno1;
		age=age1;
		name=name1;
		per=per1;
		System.out.println("Rollno="+rollno);
		System.out.println("Age="+age);
		System.out.println("Name="+name);
		System.out.println("Percentage="+per);
		System.out.println("Collegename="+collegename);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Variable_test stud=new Variable_test();
		System.out.println("***1st student***");
		stud.details(101, 20, "pragati", 95.4f);
		System.out.println("***2nd student***");
		stud.details(102, 21, "chinny", 91.5f);
		System.out.println("***3rd student***");
		stud.details(103, 22, "jay", 89.8f);
		System.out.println("***4th student***");
		stud.details(104, 21, "lishu", 98.8f);
		System.out.println("***5th student***");
		stud.details(105, 22, "bhav", 98.9f);

	}

}
