import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Hello {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(400, 500);
        frame.setBounds(100, 50, 400, 300);
        JPanel p = new JPanel();
        JButton b = new JButton("Click Me");
        p.add(b);
        frame.setContentPane(p);
        frame.setVisible(true);
    }
}
