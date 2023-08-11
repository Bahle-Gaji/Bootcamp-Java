package Book3.chapter6;

public class Employee2 {

    private String firstName;
    private String lastName;

    public Employee2(String fName, String lName) {
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
    public boolean equals(Object emp){
        if(emp instanceof Employee2){
            Employee2 e = (Employee2) emp;
            return(this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName));
        }
        return false;
    }
}