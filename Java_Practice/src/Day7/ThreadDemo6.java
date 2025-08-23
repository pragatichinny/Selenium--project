package Day7;

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 10; i+=2) System.out.println("Even: " + i);
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 9; i+=2) System.out.println("Odd: " + i);
    }
}

public class ThreadDemo6 {
    public static void main(String[] args) {
        new EvenThread().start();
        new OddThread().start();
    }
}
