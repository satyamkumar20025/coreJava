package AbstractQuestion;

public class SavingAccount extends Bank {

    private double withdrawAmount;
    private double currentAmount;
    private double emi;
    private double loanAmount;
    private double interestRate;
    private double months;

    public SavingAccount(double withdrawAmount, double currentAmount, double loanAmount,
                         double interestRate, double months) {
        this.withdrawAmount = withdrawAmount;
        this.currentAmount = currentAmount;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.months = months;
    }

    @Override
    public void withdraw() {
        if (currentAmount >= withdrawAmount) {
            currentAmount -= withdrawAmount;
            System.out.printf("Withdraw successful. Remaining balance: ₹%.2f\n", currentAmount);
        } else {
            System.out.printf("Insufficient balance. Current balance: ₹%.2f\n", currentAmount);
        }
    }

    @Override
    public void deposit(int Amount) {
        if (Amount > 0) {
            currentAmount += Amount;
            System.out.printf("Deposit successful. Current balance: ₹%.2f\n", currentAmount);
        }
    }

    @Override
    public void CalculateInterest() {
        double monthlyRate = interestRate / (12 * 100);
        emi = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, months)) /
              (Math.pow(1 + monthlyRate, months) - 1);
        System.out.printf("Calculated EMI: ₹%.2f\n", emi);
    }

    public static void main(String[] args) {
        SavingAccount bb = new SavingAccount(500, 2000, 4500, 6, 3);
        bb.deposit(500);
        bb.withdraw();
        bb.CalculateInterest();
    
    
        CurrentAmount aa = new CurrentAmount(5000, 500, 45000, 1000000, 3, 7);
        aa.deposit(1000);
        aa.withdraw();
        aa.CalculateInterest();
    }
    
}   
