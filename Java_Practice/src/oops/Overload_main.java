package oops;

public class Overload_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is the Main method");
		main(10);
		main("hello",20);

	}
	
	public static void main(int num) {
		System.out.println("Overloaded main method with an integer: "+num);
	}
	
	public static void main(String message,int value) {
		System.out.println("Overloaded main method with a string and an integer: "+message+" "+value);
	}

}
