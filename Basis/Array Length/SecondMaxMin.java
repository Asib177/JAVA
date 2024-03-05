import java.util.*;
import java.lang.*;

public class SecondMaxMin {
    public static int findMax(int[] a) {
        int max = a[0];
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                idx = i;
            }
        }
        return idx;
    }

    public static int findMin(int[] a) {
        int min = a[0];
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                idx = i;
            }
        }
        return idx;
    }

    public static int findSecondMax(int[] a) {
        int max = a[0];
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                idx = i;
            }
        }
        int secondMax = a[0];
        int secondIdx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > secondMax && i != idx) {
                secondMax = a[i];
                secondIdx = i;
            }
        }
        return secondIdx;
    }

    public static int findSecondMin(int[] a) {
        int min = a[0];
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                idx = i;
            }
        }
        int secondMin = a[0];
        int secondMinIdx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < secondMin && i != idx) {
                secondMin = a[i];
                secondMinIdx = i;
            }
        }
        return secondMinIdx;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter arr size:");
        // int size = input.nextInt();
        // int[] arr = new int[size];
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + arr[i]);
        }
        System.out.println("Max: " + findMax(arr));
        System.out.println("Mim: " + findMin(arr));
        System.out.println("SecondMax: " + findSecondMax(arr));
        System.out.println("SecondMin: " + findSecondMin(arr));
    }
}