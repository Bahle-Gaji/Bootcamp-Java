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

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public boolean equals(Object emp) {
        if (this == emp) {
            return true;
        } else if (emp == null) {
            return false;
        } else if (emp instanceof Employee) {
            Employee e = (Employee) emp;
            return (this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName));
        }
        return false;
    }
}
