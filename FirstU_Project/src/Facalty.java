package src;

public class Facalty {
    private int facultyId;
    private String facaltyName;
    private String facaltyPosition;

    public Facalty() {
    }

    public Facalty(int facultyId, String facaltyName, String facaltyPosition) {
        this.facultyId = facultyId;
        this.facaltyName = facaltyName;
        this.facaltyPosition = facaltyPosition;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public String getFacaltyName() {
        return facaltyName;
    }

    public String getFacaltyPosition() {
        return facaltyPosition;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public void setFacaltyName(String facaltyName) {
        this.facaltyName = facaltyName;
    }

    public void setFacaltyPosition(String facaltyPosition) {
        this.facaltyPosition = facaltyPosition;
    }

    @Override
    public String toString() {
        return "Facalty [facultyId=" + facultyId + ", facaltyName=" + facaltyName + ", facaltyPosition="
                + facaltyPosition + "]";
    }
}
