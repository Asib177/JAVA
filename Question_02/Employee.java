package Question_02;

import java.util.Calendar;
import java.util.Collections;

public class Employee implements Comparable<Employee> {
    private String name;
    private String id;
    private Calendar dateOfBirth;

    public Employee(String name, String id2, int day, int month, int year) {
        this.name = name;
        this.id = id2;
        this.dateOfBirth = Calendar.getInstance();
        this.dateOfBirth.set(year, month, day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int day, int month, int year) {
        this.dateOfBirth.set(year, month, day);
    }

    public double getSalary() {
        return 0;
    }

    @Override
    public int compareTo(Employee employee) {
        return Double.compare(this.getSalary(), employee.getSalary());
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", dateOfBirth=" + dateOfBirth + "]";
    }
    
}
