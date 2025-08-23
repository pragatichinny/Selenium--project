package day3_Assignment;
import java.util.Scanner;
public class Count_alp_digi_space_spie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.nextLine();
		
		int digits=0;
		int letters=0;
		int spaces=0;
		int specialChars=0;
		
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			
			if(Character.isDigit(ch)) {
				digits++;
			}else if(Character.isLetter(ch)) {
				letters++;
			}else if(Character.isWhitespace(ch)) {
				spaces++;
			}else {
				specialChars++;
			}
		}
		System.out.println("Letters: "+letters);
		System.out.println("Digits: "+digits);
		System.out.println("Spaces: "+spaces);
		System.out.println("Special Characters: "+specialChars);
	}

}
