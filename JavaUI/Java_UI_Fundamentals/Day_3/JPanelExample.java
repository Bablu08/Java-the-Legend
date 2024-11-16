package JavaUI.Java_UI_Fundamentals.Day_3;

import javax.swing.*;
import java.awt.*;

public class JPanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPanel Example");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        Create a JPanel and set its layout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

//        Add components to the JPanel
        panel.add(new JLabel("Name:"));
        panel.add(new JTextField(10));
        panel.add(new JButton("Submit"));

//        Add the JPanel to the JFrame
        frame.add(panel);

        frame.setVisible(true);
    }
}
