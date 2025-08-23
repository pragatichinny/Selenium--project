package multi_threading;
public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to deposit a non-positive amount.");
        }
    }
    public synchronized void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". New balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + ". Insufficient funds. Current balance: " + balance);
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw a non-positive amount.");
        }
    }

    public synchronized double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0); 
        Thread depositThread1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                account.deposit(100);
                try {
                    Thread.sleep(50); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "DepositThread-1");

        Thread withdrawThread1 = new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                account.withdraw(150);
                try {
                    Thread.sleep(70); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "WithdrawThread-1");

        Thread depositThread2 = new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                account.deposit(200);
                try {
                    Thread.sleep(60);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "DepositThread-2");

        depositThread1.start();
        withdrawThread1.start();
        depositThread2.start();

        try {
            depositThread1.join();
            withdrawThread1.join();
            depositThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nFinal balance: " + account.getBalance());
    }
}