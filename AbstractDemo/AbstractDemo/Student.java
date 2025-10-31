package AbstractDemo;
class Student extends Person {
    Student(String name, int age) {
        super(name, age);
    }

    void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Professor extends Person {
    Professor(String name, int age) {
        super(name, age);
    }

    void displayRole() {
        System.out.println("Role: Professor");
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Staff extends Person {
    Staff(String name, int age) {
        super(name, age);
    }
    void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


