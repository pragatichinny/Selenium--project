package Day7;

class SleepDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }
}

public class ThreadDemo4 {
    public static void main(String[] args) {
        new SleepDemo().start();
    }
}
