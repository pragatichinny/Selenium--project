package day6_assignment;
import java.util.Scanner;
public class TypeCasting_explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double originalDouble = scanner.nextDouble();

        System.out.println("Original double: " + originalDouble);

        int castToInt = (int) originalDouble;
        System.out.println("Casted to int: " + castToInt);
    
        short castToShort = (short) castToInt;
        System.out.println("Casted to short: " + castToShort);

	}

}
