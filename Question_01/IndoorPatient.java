package Question_01;

import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class IndoorPatient extends Patient {
    private Date admissionDate;
    private String bedNo;
    private double dailyFee;

    public IndoorPatient(Date admissionDate, String bedNo, double dailyFee) {
        this.admissionDate = admissionDate;
        this.bedNo = bedNo;
        this.dailyFee = dailyFee;
    }

    public IndoorPatient(String name, int age, int systolic, int diastolic, int diabetesPoint, LocalDate admissionDate2,
            String bedNo, double dailyFee) {
        super(name, age, systolic, diastolic, diabetesPoint);
        this.admissionDate = admissionDate;
        this.bedNo = bedNo;
        this.dailyFee = dailyFee;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public String getBedNo() {
        return bedNo;
    }

    public double getDailyFee() {
        return dailyFee;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public void setDailyFee(double dailyFee) {
        this.dailyFee = dailyFee;
    }

    public double getInvoice() {
        long daysInHospital = ChronoUnit.DAYS.between((Temporal) admissionDate, LocalDate.now());
        return daysInHospital * dailyFee;
    }

    @Override
    public String toString() {
        return super.toString() + ", Admission Date: " + admissionDate + ", Bed Number: " + bedNo
                + ", Daily Fee: " + dailyFee;
    }
}