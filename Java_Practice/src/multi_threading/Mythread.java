package multi_threading;
/*we can create multithreading using
 * 1.by extending thread class
 * 2.by implementing runnable interface
 */

public class Mythread extends Thread{
	void alphabet() {
		for(char ch='A';ch <='Z';ch++) {
			System.out.println(ch+"");
		}
	}
	void numbers() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+"");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread my=new Mythread();
		my.alphabet();
		my.numbers();

	}

}
