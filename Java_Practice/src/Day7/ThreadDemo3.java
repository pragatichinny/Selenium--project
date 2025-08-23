package Day7;

class MessageThread extends Thread {
    String message;
    MessageThread(String message) { this.message = message; }

    public void run() {
        for (int i = 0; i < 5; i++) System.out.println(message);
    }
}

public class ThreadDemo3 {
    public static void main(String[] args) {
        new MessageThread("Hello").start();
        new MessageThread("World").start();
    }
}

