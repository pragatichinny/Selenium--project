package exceptions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {                    //try and catch is used to handle the exceptions
		System.out.println(3/0);
		String str="Hello";
		System.out.println(str.charAt(7));
		
		int[] a=new int[4];
		System.out.println(a[6]);

		}
		catch(ArithmeticException e) { //instead of multi exception we can use single catch by using"exception"
			System.out.println(e);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println(4);
		System.out.println(5);

	}

}
