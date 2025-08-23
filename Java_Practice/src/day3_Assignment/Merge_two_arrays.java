package day3_Assignment;
import java.util.Arrays;
public class Merge_two_arrays {
	public static int[] mergeAndSort(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
        Arrays.sort(mergedArray);

        return mergedArray;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayA = {5, 2, 8};
        int[] arrayB = {1, 9, 3, 7};

        int[] result = mergeAndSort(arrayA, arrayB);

        System.out.println("Merged and Sorted Array: " + Arrays.toString(result));

	}

}
