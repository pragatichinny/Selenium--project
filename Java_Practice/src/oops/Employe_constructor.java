package oops;

public class Employe_constructor {
	
	Employe_constructor(){
		System.out.println("Default constructor");  //Default constructor
	}
	
	Employe_constructor(int id,String name){   //parameterized constructor
		System.out.println("Id is= "+id);
		System.out.println("Name is= "+name);
	}
	
	Employe_constructor(int id,String name,float salary){    //parameterized constructor
		System.out.println("Id is= "+id);
		System.out.println("Name is= "+name);
		System.out.println("Salary is= "+salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe_constructor emp=new Employe_constructor(1,"pragati",50000);

	}

}
