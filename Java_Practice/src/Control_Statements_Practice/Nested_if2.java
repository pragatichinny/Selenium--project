package Control_Statements_Practice;

public class Nested_if2 {

	public static void main(String[] args) {
		boolean Username=false;
		boolean Password=false;
		if(Username) {
			if(Password) {
				System.out.println("Login Successfull");
			}
			else {
				System.out.println("Wrong");
			}
		}
		else {
			System.out.println("Wrong Credentials");
		}

	}

}
/*1.check if a user can log in
* first check if Username is correct
* then check if password is correct
*
* 2. write a program for loan approval
* first check if salary>25000
* then check if credit score >=700
*
* 3. write a program for driving license eligibility
* age must be greater than equal to 18
* must have passed the driving test*/
 