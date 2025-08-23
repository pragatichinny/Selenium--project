package day3_Assignment;

public class Prime_num_array {
	public static boolean isPrime(int num) {
		if(num<=1)
		return false;
		
		if(num % 2 == 0) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 7, 19, 4, 15, 23, 10};
		System.out.println("Prime numbers in the array:");
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
	}

}
