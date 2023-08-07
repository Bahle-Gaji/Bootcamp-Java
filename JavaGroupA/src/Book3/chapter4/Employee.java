package Book3.chapter4;

import java.text.NumberFormat;
import java.util.Scanner;

public class Employee {

    public Employee getEmployee() {
        return this;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter salaried or hourly: ");
        String wageType = sc.nextLine();
        System.out.println("Please enter salary or rate (include cents): ");
        Double wage = sc.nextDouble();

        if(wageType.equalsIgnoreCase("salary")){
            Employee emp = new SalariedEmployee(wage);
            ((SalariedEmployee) emp).getFormattedSalary();
        }else if(wageType.equalsIgnoreCase("hourly")){
            Employee emp = new HourlyEmployee(wage);
            ((HourlyEmployee) emp).getFormattedRate();
        }else{
            System.out.println("Incorrect input");
        }

//        Employee emp2 = new HourlyEmployee(40);
//        if (emp instanceof SalariedEmployee) {
//            ((SalariedEmployee) emp).getFormattedSalary();
//        } else {
//            ((HourlyEmployee) emp).getFormattedRate();
//        }
    }
}

class SalariedEmployee extends Employee {
    double salary;

    public SalariedEmployee(double salary) {
        this.salary = salary;
    }

    public void getFormattedSalary() {
        NumberFormat sf = NumberFormat.getCurrencyInstance();
        System.out.println("The employee salary is: " + sf.format(this.salary));
    }
}


class HourlyEmployee extends Employee {
    double rate;

    public HourlyEmployee(double rate) {
        this.rate = rate;
    }

    public void getFormattedRate() {
        NumberFormat hf = NumberFormat.getCurrencyInstance();
        System.out.println("The employee's hourly rate is " + hf.format(this.rate));
    }
}