package day3_Assignment;
import java.util.Scanner;
public class Simple_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal amount:");
		float principal=sc.nextInt();
		
		System.out.println("Enter Anuual rate of interest:");
		float rate=sc.nextInt();
		
		System.out.println("Enter the time period in years:");
		float time=sc.nextInt();
		
		float simpleInterest=(principal*rate*time)/100;
		
		System.out.println("SimpleInterest= "+simpleInterest);
	}

}
