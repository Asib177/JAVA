package Q01_a;

public class Main {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void printSum(int a, int b, int c) {
                System.out.println(a + b + c);
            }

            @Override
            public void printSum(int a, int b, int c, int d) {
                System.out.println(a + b + c + d);
            }
        };

        a.printSum(2, 3); // Output: 5
        a.printSum(2, 3, 4); // Output: 9
        a.printSum(2, 3, 4, 5); // Output: 14
    }
}
