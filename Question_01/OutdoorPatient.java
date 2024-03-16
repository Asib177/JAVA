package Question_01;

public class OutdoorPatient extends Patient {
    private String specialty;
    private double consultationFee;

    public OutdoorPatient(String specialty, double consultationFee) {
    this.specialty = specialty;
    this.consultationFee = consultationFee;
    }

    public OutdoorPatient(String name, int age, int systolic, int diastolic, int diabetesPoint, String specialty,
            double consultationFee) {
        super(name, age, systolic, diastolic, diabetesPoint);
        this.specialty = specialty;
        this.consultationFee = consultationFee;
    }

    public String getSpecialty() {
        return specialty;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public double getInvoice() {
        return consultationFee;
    }

    @Override
    public String toString() {
        return "OutdoorPatient{" +
                "specialty='" + specialty + '\'' +
                ", consultationFee=" + consultationFee +
                "} " + super.toString();
    }

}