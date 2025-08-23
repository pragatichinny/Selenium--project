package exceptions;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {                    //try and catch is used to handle the exceptions
			int[] a=new int[4];
			System.out.println(a[6]);
			}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Important code"); //this will execute compulsary
		}
		System.out.println("End");

	}

}
