package day3_Assignment;
import java.util.LinkedHashSet;
import java.util.Set;
public class Remove_duplicates_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 20, 30, 40, 10, 50};

        Set<Integer> uniqueElements = new LinkedHashSet<>();

        for (int num : arr) {
            uniqueElements.add(num);
        }

        System.out.println("Array after removing duplicates:");
        for (int num : uniqueElements) {
            System.out.print(num + " ");
        }

	}

}
