package AbstractDemo;

public class UniversitySystem {
    public static void main(String[] args) {
        Person s = new Student("Alice", 20);
        Person p = new Professor("Dr. Smith", 45);
        Person st = new Staff("Bob", 35);

        s.displayRole();
        p.displayRole();
        st.displayRole();
    }
}

