package Multilevel_Inheritance_Question;

class Employee extends Person {
    int salary;

    public Employee(StringQuestion name, int salary) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
