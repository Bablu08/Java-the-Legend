package JavaUI.Java_UI_Fundamentals.Day_3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JCheckBox Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JCheckBox checkBox1 = new JCheckBox("Option 1");
        JCheckBox checkBox2 = new JCheckBox("Option 2");
        JCheckBox checkBox3 = new JCheckBox("Option 3");

        JButton button = new JButton("Submit");

//        Add ActionListener to button to show selected options
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder selectedOptions = new StringBuilder("Selected: ");
                if (checkBox1.isSelected()) selectedOptions.append("Option 1");
                if (checkBox2.isSelected()) selectedOptions.append("Option 2");
                if (checkBox3.isSelected()) selectedOptions.append("Option 3");
                JOptionPane.showMessageDialog(frame, selectedOptions.toString());
            }
        });

        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(checkBox3);
        frame.add(button);

        frame.setVisible(true);
    }
}
