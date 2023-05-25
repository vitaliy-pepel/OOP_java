/**
*  Single Responsibility Principle - принцип единственной ответственности. Каждый класс должен иметь только одну зону ответственности.
*/

//Класс Employee
public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}

//Класс SalaryCalculator
public class SalaryCalculator {
    public int calculateNetSalary(int baseSalary) {
        int tax = (int) (baseSalary * 0.25);
        return baseSalary - tax;
    }
}