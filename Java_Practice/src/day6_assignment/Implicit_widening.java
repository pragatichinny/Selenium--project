package day6_assignment;
import java.util.Scanner;
public class Implicit_widening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner inputScanner = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int originalInt = inputScanner.nextInt();
	        double widenedDouble = originalInt;

	        System.out.println("Original integer: " + originalInt);
	        System.out.println("Widened double: " + widenedDouble);

	}

}
