package day6_assignment;

	public class Exceptiondemo {
	    public static void main(String[] args) {

	        // Division by zero demo
	        try {
	            int a = 10, b = 0;
	            int result = a / b;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Division by zero is not allowed!");
	        } finally {
	            System.out.println("Operation completed.");
	        }

	        System.out.println(); // separator

	        // Array index out of bounds demo
	        try {
	            int[] numbers = {1, 2, 3};
	            System.out.println("Accessing 5th element: " + numbers[4]); 
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array index out of bounds! Please use a valid index.");
	        } finally {
	            System.out.println("Operation completed.");
	        }
	    }
	}
