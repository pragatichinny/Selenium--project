package multi_threading;
//implements runnable interface
public class Myrun implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
		}
		System.out.println("Current thread is: "+Thread.currentThread().getName());
		
	}

	public static void main(String[] args) {
		Myrun t1=new Myrun();
		t1.run();

	}

	

}
