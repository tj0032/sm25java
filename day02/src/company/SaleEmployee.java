package company;

public class SaleEmployee extends Employee  {
    // member variable
    // empNo, name, salary
    private String loc;
    private double bonus;
    private double salary;

    public SaleEmployee(){

    }
    public SaleEmployee(String name, double salary, String loc, double bonus){
        super(name, salary);
        this.loc = loc;
        this.salary = salary;
    }
    public SaleEmployee(String empNo, String name, double salary, String loc, double bonus) {
        super(empNo, name, salary);
        this.loc = loc;
        this.bonus = bonus;
    }

    public String getLoc() {
        return loc;
    }

    public double getBonus() {
        return bonus;
    }

    public double getsalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "SalesEmployee{" +
                "empNo=" + super.getEmpNo() +
                // ", name=" + super.getName() +
                ", salary=" + super.getSalary() +
                ", loc='" + loc + '\'' +
                ", bonus='" + bonus +
                '}';
    }

    @Override
    public double getAnnualSalary() {
        // return super.getAnnualSalary() * 12 + bonus;
        return super.getAnnualSalary() + bonus;
    }
}
