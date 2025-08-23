package Control_Statements_Practice;

public class Ifelse {

	public static void main(String[] args) {
		int age=10;
		if(age>=18) {
			System.out.println("Eligible for Voting");
		}
		else {
			System.out.println("Not Eligible for Voting");
		}
		
		char ch='F';
		if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'|| ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
			System.out.println(ch+ " is Vowel"); 
		}
		else {
		System.out.println(ch+" is Consonant");
		}
		
	}
}
