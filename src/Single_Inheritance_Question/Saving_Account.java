package Single_Inheritance_Question;

//Derived class
public class Saving_Account extends Bank
{
 private double interestRate;

 public Saving_Account(double accountNumber, double balance, double interestRate) {
     super(accountNumber, balance);
     this.interestRate = interestRate;
 }

 public void addInterest()
 {
     double interest = balance * interestRate/100;
     balance += interest;
     System.out.println("Interest Added:" + interest);
 }

}