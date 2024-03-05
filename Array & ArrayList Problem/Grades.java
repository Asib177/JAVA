import java.util.*;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " scores:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= (max - 10)) {
                System.out.println("Student " + i + " score is " + arr[i] + " and grade is A");
            } else if (arr[i] >= (max - 20)) {
                System.out.println("Student " + i + " score is " + arr[i] + " and grade is B");
            } else if (arr[i] >= (max - 30)) {
                System.out.println("Student " + i + " score is " + arr[i] + " and grade is C");
            } else if (arr[i] >= (max - 40)) {
                System.out.println("Student " + i + " score is " + arr[i] + " and grade is D");
            } else {
                System.out.println("Grade is F");
            }
        }
    }
}
