package day3_Assignment;
import java.util.Scanner;
public class Search_for_num_array {
	public static void main(String[] args) {
		int[] arr = {12, 45, 67, 23, 89, 34, 90};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Number found at index: " + i);
                found = true;
                break;
            }
        }
        if(!found) {
            	System.out.println("Number not found in the array.");
        }

       
	}

}
