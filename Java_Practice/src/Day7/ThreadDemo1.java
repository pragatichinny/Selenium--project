package Day7;


class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
        }
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        t.start();
    }
}
