package day3_Assignment;

public class Second_highest_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 25, 45, 98, 75, 98};

        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second highest element found (maybe all elements are the same).");
        } else {
            System.out.println("Second highest element is: " + second);
        }

	}

}
