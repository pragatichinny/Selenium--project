package Control_Statements_Practice;

public class Nested_if {

	public static void main(String[] args) {
		boolean Registered=true;
		boolean Hallticket=true;
		if(Registered) {
			if(Hallticket) {
				System.out.println("you can write your exam");
			}
			else {
				System.out.println("you need the hallticket");
			}
			}
		else {
			System.out.println("you did not registered");
		}
	}

}
