package Question_01;

public class Patient implements Comparable<Patient> {
    private String name;
    private int age;
    private int systolic;
    private int diastolic;
    private int diabetesPoint;

    public Patient() {
    }

    public Patient(String name, int age, int systolic, int diastolic, int diabetesPoint) {
        this.name = name;
        this.age = age;
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.diabetesPoint = diabetesPoint;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSystolic() {
        return systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public int getDiabetesPoint() {
        return diabetesPoint;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }

    public void setDiabetesPoint(int diabetesPoint) {
        this.diabetesPoint = diabetesPoint;
    }

    @Override
    public String toString() {
        return "Patient [name=" + name + ", age=" + age + ", systolic=" + systolic + ", diastolic=" + diastolic
                + ", diabetesPoint=" + diabetesPoint + "]";
    }

    public double getInvoice() {
        return 0;
    }


    @Override
    public int compareTo(Patient other) {
        return Integer.compare(other.getAge(), this.age);
    }

}
