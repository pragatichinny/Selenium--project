package day3_Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Sort_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.nextLine();
		
		char[] characters=input.toCharArray();
		Arrays.sort(characters);
		
		String sortedString=new String(characters);
		
		System.out.println("sorted characters: "+sortedString);

	}

}
