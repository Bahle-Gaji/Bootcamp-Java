package Book3.chapter6;

public class Employee {

    private String firstName;
    private String lastName;
    private Double salary;

    public Employee(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return this.salary;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    @Override
    public Object clone() {
        Employee emp = new Employee(this.firstName, this.lastName);
        return emp;
    }
}
