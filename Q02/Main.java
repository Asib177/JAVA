package Q02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // File obj = new
        // File("C:\\Users\\delll\\OneDrive\\Desktop\\011221177_OOP_Theory\\numbers.txt");
        // try {
        // if (obj.createNewFile()) {
        // System.out.println("File creat succcessfilly.");
        // } else {
        // System.out.println("Already exist.");
        // }
        // } catch (IOException e) {
        // System.out.println(e);
        // }

        // FileWriter obj = new
        // FileWriter("C:\\Users\\delll\\OneDrive\\Desktop\\011221177_OOP_Theory\\numbers.txt");
        // obj.write("Hii");
        // obj.close();
        try {
            File obj = new File("C:\\Users\\delll\\OneDrive\\Desktop\\011221177_OOP_Theory\\Q02\\numbers.txt");
            Scanner reader = new Scanner(obj);
            String m = reader.nextLine();
            while (m != null) {
                String[] nums = m.split(",");
                int max = Integer.parseInt(nums[0]);
                for (int i = 1; i < nums.length; i++) {
                    int num = Integer.parseInt(nums[i]);
                    if (num > max) {
                        max = num;
                    }
                }
                System.out.println(max);
                m = reader.nextLine();
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
