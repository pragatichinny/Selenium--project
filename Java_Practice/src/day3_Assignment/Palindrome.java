package day3_Assignment;

public class Palindrome {
	 public static boolean isPalindrome(String str) {
	        str = str.toLowerCase(); 

	        StringBuilder reversedStrBuilder = new StringBuilder(str);
	        reversedStrBuilder.reverse();
	        String reversedStr = reversedStrBuilder.toString();
	        return str.equals(reversedStr);
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test1 = "madam";
        String test2 = "Racecar";
        String test3 = "hello";

        System.out.println("\"" + test1 + "\" is a palindrome: " + isPalindrome(test1));
        System.out.println("\"" + test2 + "\" is a palindrome: " + isPalindrome(test2));
        System.out.println("\"" + test3 + "\" is a palindrome: " + isPalindrome(test3));
	}

}
