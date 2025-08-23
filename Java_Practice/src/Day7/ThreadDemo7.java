package Day7;

class PriorityThread extends Thread {
    PriorityThread(String name) { super(name); }
    public void run() { System.out.println(getName() + " running with priority " + getPriority()); }
}

public class ThreadDemo7 {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("T1"); t1.setPriority(Thread.MIN_PRIORITY);
        PriorityThread t2 = new PriorityThread("T2"); t2.setPriority(Thread.NORM_PRIORITY);
        PriorityThread t3 = new PriorityThread("T3"); t3.setPriority(Thread.MAX_PRIORITY);

        t1.start(); t2.start(); t3.start();
    }
}
