package company;

import java.util.UUID;

public class Employee {
    private String empNo;
    private String name;
    private double salary;

    public Employee() {
        this.empNo = UUID.randomUUID().toString();
        this.name = "이름없음";
        this.salary = 0.0;
    }

    public Employee(String name, double salary) {
        this.empNo = UUID.randomUUID().toString();
        this.name = name;
        this.salary = salary;
    }

    public Employee(String empNo, String name, double salary) {
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;
    }

    public String getEmpNo() {
        return empNo;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public double setAnnualSalary(double taxRate) {
        return (salary * 12) - (salary * 12 * taxRate);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo='" + empNo + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
