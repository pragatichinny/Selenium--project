package Day7;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Current Thread: " + Thread.currentThread().getName());
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}

