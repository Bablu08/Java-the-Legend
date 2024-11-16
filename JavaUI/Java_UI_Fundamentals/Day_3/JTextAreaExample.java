package JavaUI.Java_UI_Fundamentals.Day_3;
import javax.swing.*;
import java.awt.*;

public class JTextAreaExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextArea");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea("Type here...", 5,2);

//        Add a JScrollPane for functionality
        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
