package Single_Inheritance_Question;


public class Main {
    public static void main(StringQuestion[] args) {
        Saving_Account s1 = new Saving_Account(4554578, 10000, 5.0);
        s1.display();
        s1.deposit(2000);
        s1.withdraw(3000);
        s1.addInterest();
        s1.display();
    
}

}


 
