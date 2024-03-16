package Question_02;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        // Create three FulltimeEmployee objects
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Fulltime Employee's ID: ");
            String id = input.nextLine();
            System.out.println("Enter Fulltime Employee's name: ");
            String name = input.nextLine();
            System.out.println("Enter Fulltime Employee's day: ");
            int day = input.nextInt();
            System.out.println("Enter Fulltime Employee's month: ");
            int month = input.nextInt();
            System.out.println("Enter Fulltime Employee's year: ");
            int year = input.nextInt();
            System.out.println("Enter Fulltime Employee's monthly salary: ");
            double monthlySalary = input.nextDouble();
            input.nextLine(); // to clear the input buffer
            FulltimeEmployee fulltimeEmployee = new FulltimeEmployee(name, id, day, month, year, monthlySalary);
            if (!employees.contains(fulltimeEmployee)) {
                employees.add(fulltimeEmployee);
            }
        }

        // Create three ParttimeEmployee objects
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Parttime Employee's ID: ");
            String id = input.nextLine();
            System.out.println("Enter Parttime Employee's name: ");
            String name = input.nextLine();
            System.out.println("Enter Fulltime Employee's day: ");
            int day = input.nextInt();
            System.out.println("Enter Fulltime Employee's month: ");
            int month = input.nextInt();
            System.out.println("Enter Fulltime Employee's year: ");
            int year = input.nextInt();
            System.out.println("Enter Fulltime Employee's hours: ");
            int hours = input.nextInt();
            System.out.println("Enter Parttime Employee's hourly rate: ");
            double hourlyRate = input.nextDouble();
            input.nextLine(); // to clear the input buffer
            ParttimeEmployee parttimeEmployee = new ParttimeEmployee(name, id, day, month, year, hours, hourlyRate);
            if (!employees.contains(parttimeEmployee)) {
                employees.add(parttimeEmployee);
            }
        }

        // Print the details of every employee including the salary
        for (Employee employee : employees) {
            System.out.println(employee instanceof FulltimeEmployee ? "Fulltime" : "Parttime");
            System.out.println(employee.toString() + ", Salary: " + employee.getSalary());
        }

        // Print all the employees’ information having a specific birth year
        int birthYear = 2000;
        for (Employee employee : employees) {
            if (employee.getDateOfBirth().get(Calendar.YEAR) == birthYear) {
                System.out.println(employee.toString());
            }
        }

        // Sort the employees ArrayList based on their salary
        Collections.sort(employees);
    }

    @Override
    public String toString() {
        return "Main []";
    }

}
