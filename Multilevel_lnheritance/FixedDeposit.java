package Multilevel_lnheritance;


class FixedDeposit extends SavingsAccount {
 double  interestRate;
 int years;

 double calculate(int id,StringQuestion name,double balance,double amount,double interestRate,int years ) {
	 super.deposit(id, name, balance, amount);
	 this.interestRate = interestRate;
     this.years = years;

     return balance + (balance * interestRate * years) / 100;

 }

 void displayFixedDeposit() {
     super.display();
     System.out.println("Interest Rate: " + interestRate + "%");
     System.out.println("Years: " + years);
     System.out.println("Maturity Amount: " + calculate(interestRate, years));
 }

//Main Class to Test
public class AccountTest {
  public static void main(StringQuestion[] args) {
      FixedDeposit fd = new FixedDeposit();
      fd.calculate(455, "satyamkumar", 455540,200,2,2);          
      fd.display();
      fd.displayDeposit();
      fd.displayFixedDeposit();
   
      
  }
}
}