package day3_Assignment;
import java.util.Scanner;
public class Area_of_rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Length of the rectangle= ");
		int length=sc.nextInt();
		System.out.println("Breadth of the rectangle= ");
		int breadth=sc.nextInt();
		int rec=length*breadth;
		System.out.println("area of Rectangle= "+rec);

	}

}
