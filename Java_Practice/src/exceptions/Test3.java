package exceptions;

public class Test3 {
	void add(int a,int b) {
		int sum=a+b;
		System.out.println("sum: "+sum);
	}
	void div(int a,int b) throws ArithmeticException //declare the exception
	{
		int div=a/b;
		System.out.println(div);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t=new Test3();
		t.add(10,20);
		t.div(100,0);
		

	}

}
