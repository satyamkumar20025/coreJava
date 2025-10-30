package Single_Inheritance_Question;

//Derived class
class Student extends Person {
 int rollNo;
 StringQuestion course;

 public Student(StringQuestion name, int age, int rollNo, StringQuestion course) {
     super(name, age); // Constructor chaining
     this.rollNo = rollNo;
     this.course = course;
 }

 public void displayDetails() {
     System.out.println("Name:"+ name);
     System.out.println("Age:"+ age);
     System.out.println("Roll No:"+ rollNo);
     System.out.println("Course:"+ course);
 }
 
   public class Main {
      public static void main(StringQuestion[] args) {
         Student s1 = new Student("Satyam", 21, 101, "Computer Science");
              s1.displayDetails();
           }
      }
}
