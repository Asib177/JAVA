public class Main {
    static void checkAge(int age) {
        if(age<18)
            System.out.println("Access denied -- You are not granted.");
        else
            System.out.println("Access Granted.");
    }

    public static void main(String[] args) {
        checkAge(20);
    }
}