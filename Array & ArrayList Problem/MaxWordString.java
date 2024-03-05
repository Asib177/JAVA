public class MaxWordString {
    public static String maxWord(String str) {
        String[] strs = str.split(" ");
        int max = strs[0].length();
        int idx = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() > max) {
                max = strs[i].length();
                idx = i;
            }
        }
        return strs[idx];
    }

    public static void main(String[] args) {
        String str = "Computer Science and Engineering is really easy";
        System.out.println(maxWord(str));
    }
}
