package oops;
class School{
	School(){
		System.out.println("One particular format uniform");
		System.out.println("Fixed syllabus");
		System.out.println("Follow timing for is between 7 to 5");
	}
}
class SNBP extends School{
	SNBP(){
		super();
		System.out.println("70% study and 30% sports orinted school");
	}
}
public class Super_Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SNBP snbp=new SNBP();


	}

}
