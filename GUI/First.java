import javax.swing.*;
// import java.awt.*;

// import javafx.scene.paint.Color;

public class First {
    public static void main(String[] args) {
        JFrame f = new JFrame("My First Frame");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 200);
        java.awt.Container p = f.getContentPane();
        // JPanel p = new JPanel();
        // JPanel p = new JPanel();
        // p.setBackground(Color.cyan);
        JButton b = new JButton("Click");
        // b.setBackground(Color.red);
        // b.setForeground(Color.BLUE);
        p.add(b);
        f.setContentPane(p);
        f.setVisible(true);
    }
}
