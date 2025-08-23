package Control_Statements_Practice;

public class Test {

	public static void main(String[] args) {
		/*write a java program using if-else stat that checks a person eligibility for discount based on the following condition
		 * 1.the person must be 18 years or older and must have an id card to be allowed
		 * 2.the person gets a student discount if they are under 18 or they are student
		 */
		int Studentage=18;
		boolean Studentid=true;
		boolean Student =true;
		if(Studentage>=18 && Studentid) {
			System.out.println("Student is eligible for Discount offers and entry Allowed");
		}
		else {
			System.out.println("Student is not eligible for entry");
		}
		if(Studentage<=18 && Student) {
			System.out.println("Student is eligible for entry");
		}
		else {
			System.out.println("Student is not eligible for entry");
		}

	}

}
