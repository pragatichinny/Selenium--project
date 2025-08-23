package multi_threading;

public class Boolean_flag extends Thread{
	private volatile boolean running=true;
	
	public void run() {
		if(running) {
			System.out.println(Thread.currentThread().getName()+" is running..");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(Thread.currentThread().getName()+" was interrupted");
				running=false;
				Thread.currentThread().interrupt();
			}
		}
		System.out.println(Thread.currentThread().getName()+" has stopped..");
	}
	
	public void stopThread() {
		running=false;
	}

	public static void main(String[] args) {
		Boolean_flag myThread=new Boolean_flag();
		myThread.start();

	}

}
