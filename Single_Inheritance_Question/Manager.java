package Single_Inheritance_Question;

    class Manager extends Employee {
        String department;

        public Manager(float salary, String name, String department)
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
        public static void main(String[] args) {
            Manager e1 = new Manager(35000, "Satyam", "Java");
            e1.displayManager();
        }
    }
    }