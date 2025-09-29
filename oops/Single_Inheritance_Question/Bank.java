package Single_Inheritance_Question;

// Base class
public class Bank {
     double accountNumber;
     double balance;

    public Bank(double accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }



}

