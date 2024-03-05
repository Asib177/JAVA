import java.util.*;
import java.lang.*;
import javax.swing.*;

public class GCD {
    public static int findGCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return findGCD(n2, n1 % n2);
    }

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter your 1st input", "Input Box", JOptionPane.QUESTION_MESSAGE));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter your 2nd input", "Input Box", JOptionPane.QUESTION_MESSAGE));
        int n = findGCD(n1, n2);
        JOptionPane.showMessageDialog(null, n, "Your Output", JOptionPane.INFORMATION_MESSAGE);
    }
}
