import java.io.*;
import java.util.*;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File obj = new File("C:\\Users\\delll\\OneDrive\\Desktop\\File_Java\\file.txt");
        try {
            if (obj.createNewFile()) {
                System.out.println("File created successfully");
                System.out.println(obj.getParent());
            } else {
                System.out.println("Already exists");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        obj.setWritable(true);
        FileWriter obj1 = new FileWriter("C:\\Users\\delll\\OneDrive\\Desktop\\File_Java\\file.txt");
        obj1.write("Hello worldd");
        obj1.close();

        FileWriter obj2 = new FileWriter("C:\\Users\\delll\\OneDrive\\Desktop\\File_Java\\file.txt", true);
        BufferedWriter obj3 = new BufferedWriter(obj2);
        obj2.write("\nThis is BSCSE_Engineering 1116");
        obj2.close();

        File obj4 = new File("C:\\Users\\delll\\OneDrive\\Desktop\\File_Java\\file.txt");
        Scanner reader = new Scanner(obj4);
        int max = 0;
        String str = "";
        while (reader.hasNext()) {
            String s = reader.next();
            if (s.length() > max) {
                max = s.length();
                str = s;
            }
        }
        System.out.println(str + "\n" + max);

        File obj5 = new File("C:\\Users\\delll\\OneDrive\\Desktop\\File_Java\\result.txt");
        obj5.createNewFile();
        FileWriter obj6 = new FileWriter("C:\\Users\\delll\\OneDrive\\Desktop\\File_Java\\result.txt");
        // obj6.write(str + "\n" + max);
        obj6.write(str + "\n");
        obj6.write(String.valueOf(max));
        obj6.close();

        File obj7 = new File("C:\\Users\\delll\\OneDrive\\Desktop\\File_Java\\file1.txt");
        ArrayList<String> words = new ArrayList<>();
        Scanner reader1 = new Scanner(obj7);
        while (reader1.hasNext()) {
            words.add(reader1.next());
        }

        for (int i = 0; i < words.size(); i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(i).length() > words.get(j).length()) {
                    String x = words.get(i);
                    words.set(i, words.get(j));
                    words.set(j, x);
                }
            }
        }
        File obj8 = new File("C:\\Users\\delll\\OneDrive\\Desktop\\File_Java\\sorted.txt");
        obj8.createNewFile();
        FileWriter obj9 = new FileWriter(obj8);
        for (String s : words) {
            obj9.write(s + "\n");
        }
        obj9.close();
    }
}
