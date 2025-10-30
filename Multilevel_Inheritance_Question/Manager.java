package Multilevel_Inheritance_Question;

//Derived class
class Manager extends Employee {
 StringQuestion department;

 public Manager(StringQuestion name, int salary, StringQuestion department) {
     super(name, salary);
     this.department = department;
 }

 public StringQuestion getDepartment() {
     return department;
 }

 public void setDepartment(StringQuestion department) {
     this.department = department;
 }

 public void display() {
     System.out.println("Name: " + name);
     System.out.println("Salary: " + salary);
     System.out.println("Department: " + department);
 }

 public static void main(StringQuestion[] args) {
     Manager s1 = new Manager("Satyamdon", 10000, "Java");
     s1.display();
     s1.setName("Satyam Kumar");
     s1.setSalary(12000);
     s1.setDepartment("Python");
     System.out.println("\nAfter updates:");
     s1.display();
 }
}

