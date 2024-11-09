package JavaUI.Java_UI_Fundamentals.Day_1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Basic");
        frame.setSize(360, 680);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Enter your name:");
        label.setBounds(50, 50, 120, 30); // x, y, width, height
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(180, 50, 150, 30);
        frame.add(textField);

        JLabel email = new JLabel("Enter you email:");
        email.setBounds(50,100,120,30);
        frame.add(email);

        JTextField textField1 = new JTextField();
        textField1.setBounds(180,100,150,30);
        frame.add(textField1);

        JLabel psw = new JLabel("Enter Password");
        psw.setBounds(50, 150, 120, 30);
        frame.add(psw);

        JTextField textField2 = new JTextField();
        textField2.setBounds(180, 150, 150, 30);
        frame.add(textField2);

        JLabel cPsw = new JLabel("Conform Password");
        cPsw.setBounds(50, 200, 120, 30);
        frame.add(cPsw);

        JTextField textField3 = new JTextField();
        textField3.setBounds(180,200,150,30);
        frame.add(textField3);

        JButton button = new JButton("Register");
        button.setBounds(50, 250, 280, 50);
        frame.add(button);

        JLabel signIn = new JLabel("Already have an account? Sign In");
        signIn.setBounds(80, 290, 250, 50);
        frame.add(signIn);

        frame.setVisible(true);
    }
}
