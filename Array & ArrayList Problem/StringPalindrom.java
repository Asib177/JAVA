public class StringPalindrom {
    public static void main(String[] args) {
        String str = "RADAR";
        // str = str + "A";
        // System.out.println(str);
        // System.out.println(str.charAt(2));
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 = str1 + str.charAt(i);
        }
        System.out.println(str);
        if (str1.equals(str)) {
            System.out.println("Palindrom");
        } else
            System.out.println("Not Palindrom");
    }
}
