package type_casting;
class Test{
	void show() {
		System.out.println("Hello");
	}
}
class Test1 extends Test{
	void display() {
		System.out.println("welcome");
	}
	void show() {
		System.out.println("How are you?");
	}
}

public class Testdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test();
			t1.show();
			Test t=new Test1();//upcasting
			t.show();
			Test1 tt=(Test1)t;//downcasting
			tt.display();
			tt.show();
		
		

	}

}
