// import java.util.*;

public class TwiceArray {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("True");
                break;
            }
        }
        System.out.println("False");
    }
}
