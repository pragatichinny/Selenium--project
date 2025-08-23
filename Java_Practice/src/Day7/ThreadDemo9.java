package Day7;

class FlagThread extends Thread {
    volatile boolean running = true;

    public void run() {
        while(running) System.out.println("Running...");
        System.out.println("Thread stopped");
    }

    public void stopThread() { running = false; }
}

public class ThreadDemo9 {
    public static void main(String[] args) throws InterruptedException {
        FlagThread t = new FlagThread();
        t.start();
        Thread.sleep(1000);
        t.stopThread();
    }
}

