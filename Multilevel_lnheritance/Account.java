package Multilevel_lnheritance;


class Account {
   int id;
   StringQuestion name;

   void input(int id, StringQuestion name) {
       this.id = id;
       this.name = name;
   }

   void display() {
       System.out.println("Account ID: " + id);
       System.out.println("Account Holder Name: " + name);
   }
}
