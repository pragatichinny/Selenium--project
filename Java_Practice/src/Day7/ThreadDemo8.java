package Day7;

class JoinThread extends Thread {
    public void run() {
        for (int i=1;i<=3;i++) System.out.println(getName() + ": " + i);
    }
}

public class ThreadDemo8 {
    public static void main(String[] args) throws InterruptedException {
        JoinThread t1 = new JoinThread(); t1.setName("T1");
        JoinThread t2 = new JoinThread(); t2.setName("T2");

        t1.start();
        t1.join(); // wait for t1 to finish
        t2.start();
    }
}
