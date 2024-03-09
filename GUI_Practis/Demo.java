import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Demo implements ActionListener {

    JFrame f = new JFrame();
    JLabel id = new JLabel("ID");
    JLabel password = new JLabel("Password");
    JTextField idTF = new JTextField(20);
    JTextField passwTF = new JTextField(20);
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JLabel show = new JLabel();

    public Demo() {
        id.setBounds(10, 20, 50, 20);
        password.setBounds(10, 60, 80, 20);
        idTF.setBounds(80, 20, 200, 20);
        passwTF.setBounds(80, 60, 200, 20);
        loginButton.setBounds(80, 100, 70, 20);
        resetButton.setBounds(160, 100, 70, 20);
        show.setBounds(80, 180, 100, 30);
        f.setTitle("Login PAge");
        f.setBounds(30, 40, 500, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(id);
        f.add(idTF);
        f.add(password);
        f.add(passwTF);
        f.add(loginButton);
        f.add(resetButton);
        f.add(show);
        f.setVisible(true);

        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    public static void main(String[] args) {
        new Demo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == loginButton) {
            if (idTF.getText().equals("123") && passwTF.getText().equals("abc")) {
                show.setText("Login Sussessfully!");
            } else {
                show.setText("Login Failed!");
            }
        } else if (obj == resetButton) {
            idTF.setText("");
            passwTF.setText("");
        }
    }
}
