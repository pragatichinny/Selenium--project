package this_keyword;

public class Test {
	void display(Test t) {
		System.out.println("current class object");
	}
	void show() {
		display(this);
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.show();
		Test t1;
		t1=new Test();
		

	}

}
