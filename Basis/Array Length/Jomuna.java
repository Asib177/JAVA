import java.util.*;
import java.lang.*;

public class Jomuna {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         * int size = input.nextInt();
         * int[] asib = new int[size];
         * for (int i = 0; i < asib.length; i++) {
         * asib[i] = input.nextInt();
         * asib[i] = (int) (Math.random() * 100);
         * }
         * for (int i = 0; i < asib.length; i++) {
         * System.out.println(asib[i]);
         * }
         */

        String name = input.nextLine();
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}
