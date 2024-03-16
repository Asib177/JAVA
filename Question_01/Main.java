package Question_01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();

        // Create three IndoorPatient objects
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter IndoorPatient details:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Systolic: ");
            int systolic = scanner.nextInt();
            System.out.print("Diastolic: ");
            int diastolic = scanner.nextInt();
            System.out.print("Diabetes Point: ");
            int diabetesPoint = scanner.nextInt();
            System.out.print("Admission Date (yyyy-mm-dd): ");
            scanner.nextLine();
            LocalDate admissionDate = LocalDate.parse(scanner.nextLine());
            System.out.print("Bed Number: ");
            String bedNo = scanner.next();
            System.out.print("Daily Fee: ");
            double dailyFee = scanner.nextDouble();
            scanner.nextLine();
            patients.add(
                    new IndoorPatient(name, age, systolic, diastolic, diabetesPoint, admissionDate, bedNo, dailyFee));
        }

        // Create three OutdoorPatient objects
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter OutdoorPatient details:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Systolic: ");
            int systolic = scanner.nextInt();
            System.out.print("Diastolic: ");
            int diastolic = scanner.nextInt();
            System.out.print("Diabetes Point: ");
            int diabetesPoint = scanner.nextInt();
            System.out.print("Specialty: ");
            scanner.nextLine();
            String specialty = scanner.nextLine();
            System.out.print("Consultation Fee: ");
            double consultationFee = scanner.nextDouble();
            scanner.nextLine();
            patients.add(new OutdoorPatient(name, age, systolic, diastolic, diabetesPoint, specialty, consultationFee));
        }

        for (Patient patient : patients) {
            System.out.println(patient.toString());
            System.out.println("Invoice: " + patient.getInvoice());
        }
    }
}
