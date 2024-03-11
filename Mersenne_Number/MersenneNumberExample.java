import java.util.Scanner;
import java.math.BigInteger;

public class MersenneNumberExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // adds 1 in the given number and store it in the variable n1
        int n1 = number + 1;
        int power = 0, result = 0;
        // loop has no condition
        // the for loop execute infinite times but to control the execution of for loop
        // we have used break
        for (int i = 0;; i++) {
            // calculates the power and cast it into integer
            power = (int) Math.pow(2, i);
            // returns false if power is greater than n1
            if (power > n1) {
                // breaks the execution of the loop if the above statement returns false
                break;
            } else if (power == n1) {
                System.out.println(number + " is a Mersenne number.");
                result = 1;
            }
        }
        if (result == 0) {
            System.out.println(number + " is not a Mersenne number.");
        }
    }
}