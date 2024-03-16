package Q05;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu {
    Menu() {
        JFrame myframe;
        myframe = new JFrame();
        myframe.setLayout(new BorderLayout());
        // Set Frame title here
        myframe.setTitle("Class Test!!!");

        myframe.setSize(200, 200);
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3));
        JLabel cell[] = new JLabel[9];
        for (int i = 0; i < 9; i++) {
            // Complete the code to add label 0 to 9 and add to necessary panel
            cell[i] = new JLabel(Integer.toString(i));
            center.add(cell[i]);
            cell[i].setFont(new Font("Cambria", 2, 24));
        }
        JPanel top = new JPanel();
        top.setLayout(new GridLayout());
        // Add code for button Change and Reset and add to necessary panel
        JButton changeButton = new JButton("Change");
        JButton resetButton = new JButton("Reset");
        top.add(changeButton);
        top.add(resetButton);

        
        myframe.add(top, BorderLayout.NORTH);
        myframe.add(center, BorderLayout.CENTER);
        // Set frame visivility true
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.pack();
        myframe.setVisible(true);
    }

    public static void main(String[] args) {
        new Menu();
    }
}
