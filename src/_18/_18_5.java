package _18;

import javax.swing.*;
import java.awt.*;

public class _18_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ハジメテノGUI");
        JLabel label = new JLabel("Hello World!");
        JButton button = new JButton("押してくれ！");
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(label);
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
