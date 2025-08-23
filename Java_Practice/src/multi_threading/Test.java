package multi_threading;

public class Test extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Welcome");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Test1 extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Test1 t1 = new Test1();
        Test t2 = new Test();

        t1.start();
        t1.join();

        t2.start();
        t2.join();
    }
}
