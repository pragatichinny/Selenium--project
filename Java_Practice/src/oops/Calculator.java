package oops;

public class Calculator {
	
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public double add(double a,double b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		System.out.println("sum of two integers: "+cal.add(10, 20));
		System.out.println("sum of three integers: "+cal.add(5, 10, 35));
		System.out.println("sum of two doubles: "+cal.add(50.5, 18.9));

	}

}
