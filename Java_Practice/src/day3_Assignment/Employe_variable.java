package day3_Assignment;

import variables.Variable_test;

public class Employe_variable {
	int empid,empage;
	String empname;
	long phoneno;
	int salary;
	static String companyname="XYZ";

	void details(int empid1, int empage1, String name1,int salary1) {
		empid=empid1;
		empage=empage1;
		empname=name1;
		salary=salary1;
		System.out.println("Empid="+empid);
		System.out.println("Empage="+empage);
		System.out.println("Empname="+empname);
		System.out.println("Phoneno="+phoneno);
		System.out.println("Companyname="+companyname);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employe_variable emp=new Employe_variable();
		System.out.println("***1st Employe***");
		emp.details(101, 30, "pragati",50000);
		System.out.println("***2nd Employe***");
		emp.details(102, 32, "chinny",48000);
		System.out.println("***3rd Employe***");
		emp.details(103, 31, "jay",78000);
		System.out.println("***4th Employe***");
		emp.details(104, 35, "lishu",45000);
		System.out.println("***5th Employe***");
		emp.details(105, 32, "bhav",35000);

		
	}

}
