//Write a program in Java to design accounts class and two functions withdraw () and deposit ().

class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Account acc = new Account(1000);
        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(1500);
    }
}