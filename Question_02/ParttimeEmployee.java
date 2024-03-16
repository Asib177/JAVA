package Question_02;

public class ParttimeEmployee extends Employee {
    private int hours;
    private double hourlyRate;

    public ParttimeEmployee(String name, String id, int day, int month, int year, int hours, double hourlyRate) {
        super(name, id, day, month, year);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    public int getHours() {
        return hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getSalary() {
        return hours * hourlyRate;
    }

    @Override
    public String toString() {
        return "ParttimeEmployee [hours=" + hours + ", hourlyRate=" + hourlyRate + "]";
    }

}