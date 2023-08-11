package Book3.chapter6;

public class Employee {

    private String firstName;
    private String lastName;

    public Employee(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}
