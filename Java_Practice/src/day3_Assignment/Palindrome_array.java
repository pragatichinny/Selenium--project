package day3_Assignment;

public class Palindrome_array {
	public static boolean isPalindrome(int[] arr) {
		if(arr ==null||arr.length<=1){
			return true;
		}
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			if(arr[left]!=arr[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] palindromeArray= {1,2,3,2,1};
		int[] nonPalindromeArray= {1,2,3,4,5};
		int[] singleElementArray= {7};
		int[] emptyArray= {};
		

		System.out.println("Is {1,2,3,2,1} a palindrome? "+ isPalindrome(palindromeArray));
		System.out.println("Is {1,2,3,4,5} a palindrome? "+ isPalindrome(nonPalindromeArray));
		System.out.println("Is {7} a palindrome? "+ isPalindrome(singleElementArray));
		System.out.println("Is {} a palindrome? "+ isPalindrome(emptyArray));

	}

}
