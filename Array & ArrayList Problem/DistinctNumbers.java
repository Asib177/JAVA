// import java.util.*;

// public class DistinctNumbers {
//     public static int Isdistinct(int arr[]) {

//         return 0;
//     }
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int[] arr = new int[10];
//         for (int i = 0; i < 10; i++) {
//             arr[i] = input.nextInt();
//         }
//         System.out.println(Isdistinct(arr));
//     }
// }

import java.util.*;

public class DistinctNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            if (isDistinct(numbers, count, num)) {
                numbers[count] = num;
                count++;
            }
        }

        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static boolean isDistinct(int[] numbers, int count, int num) {
        for (int i = 0; i < count; i++) {
            if (num == numbers[i]) {
                return false;
            }
        }
        return true;
    }
}