package day3_Assignment;

public class Rotate_array_left {
	static void leftRotatebyOne(int[] arr) {
        int firstElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1]; 
        }
        arr[arr.length - 1] = firstElement; 
    }

    public static void leftRotate(int[] arr, int d) {
        
        d = d % arr.length; 
        for (int i = 0; i < d; i++) {
            leftRotatebyOne(arr);
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int rotations = 2;

        System.out.print("Original array: ");
        printArray(arr);

        leftRotate(arr, rotations);
        System.out.print("Array after " + rotations + " left rotations: ");
        printArray(arr);

	}

}
