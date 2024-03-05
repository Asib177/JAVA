import src.Student;
import src.Facalty;
import src.Course;
import java.util.*;
import java.io.*;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static ArrayList<Student> students = new ArrayList<Student>();
    public static ArrayList<Facalty> facalties = new ArrayList<Facalty>();
    public static ArrayList<Course> courses = new ArrayList<Course>();
    public static Scanner input = new Scanner(System.in);

    public static void addStudent() {
        System.out.println("Name: ");
        input.nextLine();
        String n = input.nextLine();
        System.out.println("ID: ");
        int id = input.nextInt();
        System.out.println("CGPA: ");
        double cg = input.nextDouble();
        Student s = new Student(id, n, cg);
        boolean flag = false;
        for (Student e : students) {
            if (e.getStudentId() == s.getStudentId()) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println((ANSI_RED_BACKGROUND + "Student already exists. Try Again!" + ANSI_RESET));
        } else {
            students.add(s);
            System.out.println((ANSI_RED_BACKGROUND + "Student added successfully!" + ANSI_RESET));
        }
    }

    public static void addCourse() {
        System.out.println("ID: ");
        input.nextLine();
        String id = input.nextLine();
        System.out.println("Title: ");
        String t = input.nextLine();
        System.out.println("Cradit: ");
        double crd = input.nextDouble();
        Course c = new Course(id, t, crd);

        boolean flag = false;
        for (Course e : courses) {
            if (e.getCourseId().equals(c.getCourseId())) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println((ANSI_RED_BACKGROUND + "Course already exist. Try Again!" + ANSI_RESET));
        } else {
            courses.add(c);
            System.out.println((ANSI_RED_BACKGROUND + "Coursr added successfully." + ANSI_RESET));
        }
    }

    public static void addFacalty() {
        System.out.println("ID: ");
        int id = input.nextInt();
        System.out.println("Name: ");
        input.nextLine();
        String n = input.nextLine();
        System.out.println("Position: ");
        String p = input.nextLine();
        Facalty f = new Facalty(id, n, p);

        boolean flag = false;
        for (Facalty e : facalties) {
            if (e.getFacultyId() == f.getFacultyId()) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println((ANSI_RED_BACKGROUND + "Facalty already exist. Try Again!" + ANSI_RESET));
        } else {
            facalties.add(f);
            System.out.println((ANSI_RED_BACKGROUND + "Facalty added successfully." + ANSI_RESET));
        }
    }

    public static void addStudentCourse() {
        System.out.println("Enter the course ID: ");
        input.nextLine();
        String cid = input.nextLine();
        System.out.println("Enter the student ID: ");
        int sid = input.nextInt();

        int courseIndex = -1;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(cid)) {
                courseIndex = i;
                break;
            }
        }
        int studentIndex = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == sid) {
                studentIndex = i;
                break;
            }
        }

        if (courseIndex == -1 || studentIndex == -1) {
            System.out.println((ANSI_RED_BACKGROUND + "Invalid course or student.!" + ANSI_RESET));
        } else {
            courses.get(courseIndex).addStudent(students.get(studentIndex));
            System.out.println((ANSI_RED_BACKGROUND + "Student added course successfully." + ANSI_RESET));
        }
    }

    public static void addFacaltyCourse() {
        System.out.println("Enter the course ID: ");
        input.nextLine();
        String cid = input.nextLine();
        System.out.println("Enter the Facalty ID: ");
        int fid = input.nextInt();

        int courseIndex = -1;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(cid)) {
                courseIndex = i;
                break;
            }
        }
        int facaltyIndex = -1;
        for (int i = 0; i < facalties.size(); i++) {
            if (facalties.get(i).getFacultyId() == fid) {
                facaltyIndex = i;
                break;
            }
        }
        if (courseIndex == -1 || facaltyIndex == -1) {
            System.out.println((ANSI_RED_BACKGROUND + "Invalid course or Facalty.!" + ANSI_RESET));
        } else {
            courses.get(courseIndex).addFacalty(facalties.get(facaltyIndex));
            System.out.println((ANSI_RED_BACKGROUND + "Facalty added of course successfully." + ANSI_RESET));
        }
    }

    public static void deleteStudent() {
        System.out.println("Enter delete student ID: ");
        int sid = input.nextInt();

        int studentIndex = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == sid) {
                studentIndex = i;
                break;
            }
        }
        if (studentIndex == -1) {
            System.out.println((ANSI_RED_BACKGROUND + "Student doesn't match. Tey Again!" + ANSI_RESET));
        } else {
            students.remove(studentIndex);
            System.out.println((ANSI_RED_BACKGROUND + "Student delete successfully." + ANSI_RESET));
        }
    }

    public static void deleteCourse() {
        System.out.println("Enter delete course ID: ");
        String cid = input.next();

        int courseIndex = -1;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(cid)) {
                courseIndex = i;
                break;
            }
        }
        if (courseIndex == -1) {
            System.out.println((ANSI_RED_BACKGROUND + "Course doesn't match. Tey Again!" + ANSI_RESET));
        } else {
            courses.remove(courseIndex);
            System.out.println((ANSI_RED_BACKGROUND + "Course delete successfully." + ANSI_RESET));
        }
    }

    public static void deleteFacalty() {
        System.out.println("Enter delete facalty ID: ");
        int fid = input.nextInt();

        int facaltyIndex = -1;
        for (int i = 0; i < facalties.size(); i++) {
            if (facalties.get(i).getFacultyId() == fid) {
                facaltyIndex = i;
                break;
            }
        }
        if (facaltyIndex == -1) {
            System.out.println((ANSI_RED_BACKGROUND + "Facalty doesn't match. Tey Again!" + ANSI_RESET));
        } else {
            facalties.remove(facaltyIndex);
            System.out.println((ANSI_RED_BACKGROUND + "Facalty delete successfully." + ANSI_RESET));
        }
    }

    public static void deleteStudentCourse() {
        System.out.println("Enter student id: ");
        int sid = input.nextInt();
        System.out.println("Enter course id: ");
        String cid = input.next();

        int studentIndex = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == sid) {
                studentIndex = i;
                break;
            }
        }
        int courseIndex = -1;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(cid)) {
                courseIndex = i;
                break;
            }
        }
        if (studentIndex == -1 || courseIndex == -1) {
            System.out.println((ANSI_RED_BACKGROUND + "Doesn't match student or course." + ANSI_RESET));
        } else {
            courses.remove(studentIndex);
            System.out.println((ANSI_RED_BACKGROUND + "Student delete of course successfully." + ANSI_RESET));
        }
    }

    public static void deleteFacaltyCourse() {
        System.out.println("Enter Facalty id: ");
        int fid = input.nextInt();
        System.out.println("Enter course id: ");
        String cid = input.next();

        int facaltyIndex = -1;
        for (int i = 0; i < facalties.size(); i++) {
            if (facalties.get(i).getFacultyId() == fid) {
                facaltyIndex = i;
                break;
            }
        }
        int courseIndex = -1;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(cid)) {
                courseIndex = i;
                break;
            }
        }
        if (facaltyIndex == -1 || courseIndex == -1) {
            System.out.println((ANSI_RED_BACKGROUND + "Doesn't match facalty or course." + ANSI_RESET));
        } else {
            courses.remove(facaltyIndex);
            System.out.println((ANSI_RED_BACKGROUND + "Facalty delete of course successfully." + ANSI_RESET));
        }
    }

    public static void updateStudent() {
        System.out.println("Enter student id: ");
        int sid = input.nextInt();

        int studentIndex = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == sid) {
                studentIndex = i;
                break;
            }
        }
        if (studentIndex == -1) {
            System.out.println((ANSI_RED_BACKGROUND + "Student doesn't match. Enter write Student ID!" + ANSI_RESET));
        } else {
            System.out.println("1. Update Name\n2. Update ID\n3. Update CGPA");
            int x = input.nextInt();
            if (x == 1) {
                System.out.println("Enter update student name: ");
                String n = input.nextLine();
                students.get(studentIndex).setStudentName(n);
            } else if (x == 2) {
                System.out.println("Enter update student ID: ");
                int id = input.nextInt();
                students.get(studentIndex).setStudentId(id);
            } else if (x == 3) {
                System.out.println("Enter update student CGPA: ");
                double cgpa = input.nextDouble();
                students.get(studentIndex).setStudentCGPA(cgpa);
            }
            System.out.println((ANSI_RED_BACKGROUND + "Student Update Successfully." + ANSI_RESET));
        }
    }

    public static void updateCourse() {
        System.out.println("Enter course id: ");
        String cid = input.next();

        int courseIndex = -1;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId() == cid) {
                courseIndex = i;
                break;
            }
        }
        if (courseIndex == -1) {
            System.out.println((ANSI_RED_BACKGROUND + "Course doesn't match. Enter write Course ID!" + ANSI_RESET));
        } else {
            System.out.println("1. Update ID\n2. Update Title\n3. Update Credit");
            int x = input.nextInt();
            if (x == 1) {
                System.out.println("Enter update course ID: ");
                String cID = input.next();
                courses.get(courseIndex).setCourseId(cID);
            } else if (x == 2) {
                System.out.println("Enter update course Title: ");
                String ct = input.nextLine();
                courses.get(courseIndex).setCourseTitle(ct);
            } else if (x == 3) {
                System.out.println("Enter update course credit: ");
                double cd = input.nextDouble();
                courses.get(courseIndex).setCredit(cd);
            }
            System.out.println((ANSI_RED_BACKGROUND + "Course Update Successfully." + ANSI_RESET));
        }
    }

    public static void updateFacalty() {
        System.out.println("Enter facalty id: ");
        int fid = input.nextInt();

        int facaltyIndex = -1;
        for (int i = 0; i < facalties.size(); i++) {
            if (facalties.get(i).getFacultyId() == fid) {
                facaltyIndex = i;
                break;
            }
        }
        if (facaltyIndex == -1) {
            System.out.println((ANSI_RED_BACKGROUND + "Facalty doesn't match. Enter write Facalty ID!" + ANSI_RESET));
        } else {
            System.out.println("1. Update Name\n2. Update ID\n3. Update Position");
            int x = input.nextInt();
            if (x == 1) {
                System.out.println("Enter update facalty name: ");
                String n = input.nextLine();
                facalties.get(facaltyIndex).setFacaltyName(n);
            } else if (x == 2) {
                System.out.println("Enter update facalty ID: ");
                int fId = input.nextInt();
                facalties.get(facaltyIndex).setFacultyId(fId);
            } else if (x == 3) {
                System.out.println("Enter update Facalty Position: ");
                String fPosition = input.nextLine();
                students.get(facaltyIndex).setFacaltyPosition(fPosition);
            }
            System.out.println((ANSI_RED_BACKGROUND + "Facalty Update Successfully." + ANSI_RESET));
        }
    }

    public static void studentTakeCourse() {
        System.out.println("Enter the student ID: ");
        int sid = input.nextInt();

        int courseIndex = -1;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(sid)) {
                System.out.println((ANSI_RED_BACKGROUND + courses.get(i) + ANSI_RESET));
            }
        }
    }

    public static void studentVScourse() {
        System.out.println("Enter student ID: ");
        int sid = input.nextInt();

        boolean flag = false;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(sid)) {
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println((ANSI_RED_BACKGROUND + "A student doesn't takes a course" + ANSI_RESET));
        } else {
            System.out.println((ANSI_RED_BACKGROUND + "A student takes a course" + ANSI_RESET));
        }
    }

    public static void facaltyVScourse() {
        System.out.println("Enter facalty ID: ");
        int fid = input.nextInt();

        boolean flag = false;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(fid)) {
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println((ANSI_RED_BACKGROUND + "A faculty doesn't teaches a course" + ANSI_RESET));
        } else {
            System.out.println((ANSI_RED_BACKGROUND + "A faculty teaches a course" + ANSI_RESET));
        }
    }

    public static void coursesVSstudent() {
        System.out.println("Enter student ID: ");
        int sid = input.nextInt();

        boolean flag = false;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(sid)) {
                System.out.println((ANSI_RED_BACKGROUND + courses.get(i).getCourseTitle().toString() + ANSI_RESET));
            }
        }
        if (flag == false) {
            System.out.println((ANSI_RED_BACKGROUND + "A courses doesn't take by a student" + ANSI_RESET));
        } else {
            System.out.println(
                    (ANSI_RED_BACKGROUND + "A courses take by a student and the courses are given." + ANSI_RESET));
        }
    }

    public static void coursesVSfacalty() {
        System.out.println("Enter facalty ID: ");
        int fid = input.nextInt();

        boolean flag = false;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(fid)) {
                System.out.println((ANSI_RED_BACKGROUND + courses.get(i).getCourseTitle().toString() + ANSI_RESET));
            }
        }
        if (flag == false) {
            System.out.println((ANSI_RED_BACKGROUND + "A courses doesn't take by a facalty" + ANSI_RESET));
        } else {
            System.out.println(
                    (ANSI_RED_BACKGROUND + "A courses take by a facalty and the courses are given." + ANSI_RESET));
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("a. Add\nb. Delete\nc. Update\nd. Print\ne. Search\nf. Exit");
            char ch = input.next().charAt(0);
            if (ch == 'f') {
                break;
            } else if (ch == 'a') {
                System.out.println(
                        "1. Add a Student\n2. Add a Course\n3. Add a Facalty\n4. Add a student to a course\n5. Add a faculty to a course\n0. Return to main menu");
                int x = input.nextInt();
                if (x == 0) {
                    continue;
                } else if (x == 1) {
                    addStudent();
                } else if (x == 2) {
                    addCourse();
                } else if (x == 3) {
                    addFacalty();
                } else if (x == 4) {
                    addStudentCourse();
                } else if (x == 5) {
                    addFacaltyCourse();
                }
            } else if (ch == 'b') {
                System.out.println(
                        "1. Delete a Student\n2. Delete a Course\n3. Delete a Facalty\n4. Delete a student to a course\n5. Delete a faculty to a course\n0. Return to main menu");
                int x = input.nextInt();
                if (x == 0) {
                    continue;
                } else if (x == 1) {
                    deleteStudent();
                } else if (x == 2) {
                    deleteCourse();
                } else if (x == 3) {
                    deleteFacalty();
                } else if (x == 4) {
                    deleteStudentCourse();
                } else if (x == 5) {
                    deleteFacaltyCourse();
                }
            } else if (ch == 'c') {
                System.out.println(
                        "1. Update a Student\n2. Update a Course\n3. Update a Facalty\n0. Return to main menu");
                int x = input.nextInt();
                if (x == 0) {
                    continue;
                } else if (x == 1) {
                    updateStudent();
                } else if (x == 2) {
                    updateCourse();
                } else if (x == 3) {
                    updateFacalty();
                }
            } else if (ch == 'd') {
                System.out.println(
                        "1. Print all students\n2. Print all courses\n3. Print all faculties\n4. Print information of a student\n5. Print information of a course\n6. Print information of a faculty\n7. Print student list and faculty information of a course\n8. Print courses taken by a student\n0. Return main menu");
                int x = input.nextInt();
                if (x == 0) {
                    continue;
                } else if (x == 1) {
                    for (Student e : students) {
                        System.out.println((ANSI_RED_BACKGROUND + e.toString() + ANSI_RESET));
                    }
                } else if (x == 2) {
                    for (Course e : courses) {
                        System.out.println((ANSI_RED_BACKGROUND + e.toString() + ANSI_RESET));
                    }
                } else if (x == 3) {
                    for (Facalty e : facalties) {
                        System.out.println((ANSI_RED_BACKGROUND + e.toString() + ANSI_RESET));
                    }
                } else if (x == 4) {
                    int sid = input.nextInt();
                    for (Student e : students) {
                        if (e.getStudentId() == sid) {
                            System.out.println((ANSI_RED_BACKGROUND + e.toString() + ANSI_RESET));
                        }
                    }
                } else if (x == 5) {
                    input.nextLine();
                    String cid = input.nextLine();
                    for (Course e : courses) {
                        if (e.getCourseId() == cid) {
                            System.out.println((ANSI_RED_BACKGROUND + e.toString() + ANSI_RESET));
                        }
                    }
                } else if (x == 6) {
                    int fid = input.nextInt();
                    for (Facalty e : facalties) {
                        if (e.getFacultyId() == fid) {
                            System.out.println((ANSI_RED_BACKGROUND + e.toString() + ANSI_RESET));
                        }
                    }
                } else if (x == 7) {
                    System.out.println("Enter the course ID: ");
                    String cid = input.next();
                    for (Course e : courses) {
                        if (e.getCourseId().equals(cid)) {
                            e.peintStudentList();
                        }
                    }
                } else if (x == 8) {
                    studentTakeCourse();
                }
            } else if (ch == 'e') {
                System.out.println(
                        "a. Search a Student\nb. Search a Course\nc. Search a Faculty\nd. Search whether a student takes a course\ne. Search whether a faculty teaches a course\nf. Search courses taken by a student\ng. Search courses taught by a faculty\nz. Return main menu");
                char x = input.next().charAt(0);
                if (x == 'z') {
                    continue;
                } else if (x == 'a') {
                    int sid = input.nextInt();
                    for (Student e : students) {
                        if (sid == e.getStudentId()) {
                            System.out.println((ANSI_RED_BACKGROUND + "Student Match" + e.toString() + ANSI_RESET));
                        } else {
                            System.out.println((ANSI_RED_BACKGROUND + "Student doesn't Match" + ANSI_RESET));
                        }
                    }
                } else if (x == 'b') {
                    String cid = input.next();
                    for (Course e : courses) {
                        if (cid == e.getCourseId()) {
                            System.out.println((ANSI_RED_BACKGROUND + "Course Match\n" + e.toString() + ANSI_RESET));
                        } else {
                            System.out.println((ANSI_RED_BACKGROUND + "Course doesn't Match" + ANSI_RESET));
                        }
                    }
                } else if (x == 'c') {
                    int fid = input.nextInt();
                    for (Facalty e : facalties) {
                        if (fid == e.getFacultyId()) {
                            System.out.println((ANSI_RED_BACKGROUND + "Facalty Match" + e.toString() + ANSI_RESET));
                        } else {
                            System.out.println((ANSI_RED_BACKGROUND + "Facalty doesn't Match" + ANSI_RESET));
                        }
                    }
                } else if (x == 'd') {
                    studentVScourse();
                } else if (x == 'e') {
                    facaltyVScourse();
                } else if (x == 'f') {
                    coursesVSstudent();
                } else if (x == 'g') {
                    coursesVSfacalty();
                }
            }
        }
    }
}
