package Question_02;

public class FulltimeEmployee extends Employee {
    private double monthlySalary;

    public FulltimeEmployee(String name, String id, int day, int month, int year, double monthlySalary) {
        super(name, id, day, month, year);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double getSalary() {
        return monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "FulltimeEmployee [monthlySalary=" + monthlySalary + "]";
    }

}