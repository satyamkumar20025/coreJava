package Multilevel_lnheritance;


class Account {
   int id;
   String name;

   void input(int id, String name) {
       this.id = id;
       this.name = name;
   }

   void display() {
       System.out.println("Account ID: " + id);
       System.out.println("Account Holder Name: " + name);
   }
}
