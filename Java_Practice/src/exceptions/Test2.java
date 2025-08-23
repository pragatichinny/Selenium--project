package exceptions;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj=new String("Hello");
		String str1="123";
		int age=30;
		try{
			String str=null;// NullPointerException
		System.out.println(str.length());		
		
		int num=(int)obj;//ClassCastException
		System.out.println("Number: "+num);
		
		Class.forName("com.example.NonExistentClass"); //ClassNotFoundException
		System.out.println("Class loaded");
		
		int num1=Integer.parseInt(str1); //NumberFormatException
		System.out.println("Parsed int from str1: "+num1);
		
		age(-5);//IllegalArgumentException
		
		}
		catch(ClassCastException e) {
			System.out.println(e);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e);
		}
	
	
		finally {
			System.out.println("Important code"); //this will execute compulsary
		}

	}

	private static void age(int i) {
		// TODO Auto-generated method stub
		
	}

}
