package Day7;

class CounterThread extends Thread {
    static int counter = 0;

    public void run() {
        for (int i=0;i<1000;i++) counter++;
    }
}

public class ThreadDemo10 {
    public static void main(String[] args) throws InterruptedException {
        CounterThread t1 = new CounterThread();
        CounterThread t2 = new CounterThread();
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Counter: " + CounterThread.counter);
    }
}
