package Abstract;

public class CurrentAmount extends Bank {

    private double requiementAmount;
    private double withdrawAmount;
    private double currentAmount;
    private double emi;
    private double loanAmount;
    private double interestRate;
    private double months;

    public CurrentAmount(double requiementAmount, double withdrawAmount, double currentAmount,
                         double loanAmount, double interestRate, double months) {
        this.requiementAmount = requiementAmount;
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

   
}