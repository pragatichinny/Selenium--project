package day3_Assignment;
import java.util.Scanner;
public class Start_end_letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a string:");
	        String input = scanner.nextLine();

	        String lowerInput = input.toLowerCase();

	        // Check if it starts with 'j' and ends with 'a'
	        if (lowerInput.startsWith("j") && lowerInput.endsWith("a")) {
	            System.out.println("The string starts with 'j' and ends with 'a'.");
	        } else {
	            System.out.println("The string does NOT start with 'j' and end with 'a'.");
	        }

	}

}
