package day3_Assignment;
import java.util.Arrays;
public class Copy_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] source = {5, 10, 15, 20, 25};

	        int[] destination = new int[source.length];

	        for (int i = 0; i < source.length; i++) {
	            destination[i] = source[i];
	        }

	        System.out.println("Copied array: " + Arrays.toString(destination));

	}

}
