public class Main {
    static int myNumber(int x, int y) {
        return x + y;
    }
    static double myNumber(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int num1 = myNumber(20, 5);
        double num2 = myNumber(20.5,5.5);

        System.out.println("int : " + num1);
        System.out.println("double : " + num2);
    }
}