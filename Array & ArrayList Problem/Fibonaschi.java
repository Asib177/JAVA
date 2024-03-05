import java.util.*;

public class Fibonaschi {
    public static ArrayList<Integer> fib(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (n == 1) {
            list.add(0);
            return list;
        } else if (n == 2) {
            list.add(0);
            list.add(1);
            return list;
        } else {
            list.add(0);
            list.add(1);
            for (int i = 2; i < n; i++) {
                int three = list.get(i - 1) + list.get(i - 2);
                list.add(three);
            }
            return list;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        ArrayList<Integer> list = fib(n);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}