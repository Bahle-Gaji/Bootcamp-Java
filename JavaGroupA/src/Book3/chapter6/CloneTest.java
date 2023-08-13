package Book3.chapter6;

public class CloneTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Emile", "Blonsky");
        Employee emp2 = (Employee) emp1.clone();
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
