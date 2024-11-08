package JavaUI.Java_UI_Fundamentals;
import javax.swing.*;
public class Day_1 {
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

        JButton button = new JButton("Click Me");
        button.setBounds(150, 100, 150, 50);
        frame.add(button);

        frame.setVisible(true);
    }
}
