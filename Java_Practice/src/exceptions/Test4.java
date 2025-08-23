package exceptions;

public class Test4 {  //throw exception

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="null";
		if(name==null) { //generating or throwing exception
			throw new NullPointerException("Name should not be null");
		}
		
		System.out.println(name.length());
		

	}

}
