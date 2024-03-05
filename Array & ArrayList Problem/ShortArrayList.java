import java.util.*;

public class ShortArrayList {
    public static Scanner input = new Scanner(System.in);

    public static ArrayList<Integer> fib(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            arr.add(i);
        }
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    temp = arr.get(i);
                    arr.get(i) = arr.get(j);
                    arr.get(j) = temp;
                    return arr.get(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = input.nextInt();

        ArrayList<Integer> arr1 = fib(n);
        for (int i = 0; i < arr1.size(); i++) {
            System.out.println(arr1.get(i) + " ");
        }
    }
}
