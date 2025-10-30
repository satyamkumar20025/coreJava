package User_Exception;

public class Employee {

    double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double setsalary(double salary) throws NegativeSalaryException {
        if (salary < 0) {
            throw new NegativeSalaryException("Salary cannot be negative");
        }
        this.salary = salary;
        return this.salary;
    }

   
}