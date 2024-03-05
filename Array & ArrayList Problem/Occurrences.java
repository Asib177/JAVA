/*import java.util.*;

public class Occurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;
        for (int i = 0; i < 100; i++) {
            arr[i] = input.nextInt();
            count++;
            if (arr[i] == 0) {
                break;
            }
        }
        // int idx = 0;
        // int a = arr[0];
        // while (arr.length != '\0') {
        // for (int i = 0; i < arr.length; i++) {
        // idx = arr[i];
        // if (arr[i] == a) {
        // count++;
        // }
        // }
        // System.out.println(idx + " occurs " + count + " times");
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == a) {
        //         count++;
        //     }
        //     System.out.println(arr[i] + " occurs " + count + " times");
        // }
    }
}*/

import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] counts = new int[101]; // array to hold counts

        // read integers from input
        System.out.print("Enter integers between 1 and 100 (end with 0): ");
        int num = input.nextInt();
        while (num != 0) {
            if (num >= 1 && num <= 100) {
                counts[num]++; // increment count for this number
            }
            num = input.nextInt();
        }

        // output counts for each number
        for (int i = 1; i <= 100; i++) {
            if (counts[i] > 0) {
                System.out.printf("%d occurs %d time%s\n", i, counts[i], (counts[i] > 1 ? "s" : ""));
            }
        }
    }
}
