package wraper_classes;

public class Auto_demo {

	private static Object character;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//autoboxing(convert primitive to wrapper classes)
		int num=10;
		System.out.println("Primitive type of data="+num);//memory allocation 4 byte
		Integer num1=num;//converting primitive int to object Integer
		System.out.println("Wrapped data="+num1);//memory allocate triple than a primitive type i.e 12 to 15
		
		
		//unboxing(convert wrappers to primitive)
		Integer a=20;
		System.out.println("for object="+a);
		int b=a;//converting object to primitive int
		System.out.println("For primitive data type:"+b);
		
		
		//String to int 
		String str="123";
		int ab=Integer.parseInt(str);
		System.out.println(ab);
		
		//int to String
		String n=Integer.toString(num);
		System.out.println(n);
		
		String str2="abd234";
		for(char ch:str2.toCharArray()) {
			if(Character.isDigit(ch)) {
			System.out.println(ch+"is a digit");
		}else {
			System.out.println(ch+"is a character");
		}

	}
	}
}
