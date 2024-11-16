package JavaUI.Java_UI_Fundamentals.Day_2;
import javax.swing.*;
import java.awt.event.*;
public class ButtonClickExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Click Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me");

//        Add ActionListener to handel the button click
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Click!");
            }
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
