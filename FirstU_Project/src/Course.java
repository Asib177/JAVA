package src;

import java.util.ArrayList;
import src.Student;

public class Course {
    private String courseId;
    private String courseTitle;
    private double credit;
    private ArrayList<Student> studentList = new ArrayList<Student>();
    private int numberOfStudents = 0;
    private Facalty facalty;

    public Course() {
    }

    public Course(String courseId, String courseTitle, double credit) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public double getCredit() {
        return credit;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void addStudent(Student s) {
        boolean flag = true;
        for (Student e : studentList) {
            if (e.getStudentId() == s.getStudentId()) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            studentList.add(s);
            numberOfStudents++;
        } else {
            System.out.println("Student is already in the course");
        }
    }

    public void dropStudent(int sid) {
        int studentIndex = -1;
        for (int i = 0; i < studentList.size(); i++) {
            if (sid == studentList.get(i).getStudentId()) {
                studentIndex = i;
                break;
            }
        }
        if (studentIndex == -1) {
            System.out.println("Student doesn't exist.");
        } else {
            studentList.remove(studentIndex);
            numberOfStudents--;
        }
    }

    public void addFacalty(Facalty f) {
        this.facalty = f;
    }

    public void dropFacalty() {
        this.facalty = null;
    }

    public void peintStudentList() {
        for (Student s : studentList) {
            final String ANSI_RESET = "\u001B[0m";
            final String ANSI_RED_BACKGROUND = "\u001B[41m";
            System.out.println((ANSI_RED_BACKGROUND + s.toString() + ANSI_RESET));
        }
    }

    @Override
    public String toString() {
        return "Course [courseId=" + courseId + ", courseTitle=" + courseTitle + ", credit=" + credit + "]";
    }
}
