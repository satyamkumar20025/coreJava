package Multilevel_lnheritance;


class SavingsAccount extends Account {
    double balance;
    double amount;

    public void deposit(int id, StringQuestion name, double amount) {
        super.input(id, name);
        this.amount = amount;
        this.balance += amount;
        System.out.println("Amount Deposited: ₹" + amount);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void displayDeposit() {
        super.display();
        System.out.println("Balance: ₹" + balance);
    }
}