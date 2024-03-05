import java.util.*;

public class TenIntegerInConsol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int num = input.nextInt();
        int[] arr = new int[num];
        int count = 0, temp = 0, sum = 0, num2 = 0;
        System.out.println("Enter Array Element:");
        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
            if (arr[i] != 0) {
                num2++;
            } else if (arr[i] == 0) {
                System.out.println("Sorry! Your program ends");
                break;
            }
        }
        for (int i = 0; i < num; i++) {
            if (arr[i] != 0) {
                if (arr[i] > 0 && arr[i] != 0) {
                    count++;
                } else if (arr[i] < 0 && arr[i] != 0) {
                    temp++;
                }
                sum += arr[i];
            }
        }
        double avg = (double) sum / num2;
        System.out.println("Posetive Numbers: " + count + "\nNegative Numbers: "
                + temp + "\nSum is: " + sum + "\nAverage: " + avg);
    }
}