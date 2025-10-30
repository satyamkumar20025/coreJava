package Single_Inheritance_Question;

    class Manager extends Employee {
        StringQuestion department;

        public Manager(float salary, StringQuestion name, StringQuestion department)
        {
            super(salary, name);
            this.department = department;
        }

        void displayManager()
        {
            System.out.println("Salary:     " + salary);
            System.out.println("Name:       " + name);
            System.out.println("Department: " + department);
        }


    public class Main {
        public static void main(StringQuestion[] args) {
            Manager e1 = new Manager(35000, "Satyam", "Java");
            e1.displayManager();
        }
    }
    }