package org.albert;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class App
{
    public static void main(String[] args)
    {
        final ImageIcon icon = new ImageIcon("img.png");
        final JLabel label = new JLabel();
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        final JPanel cyanJPanel = new JPanel();
        cyanJPanel.setBackground(Color.CYAN);
        cyanJPanel.setBounds(0, 0, 200, 200);
        // Used for setVerticalAlignment() and setHorizontalAlignment()
        cyanJPanel.setLayout(new BorderLayout());
//        cyanJPanel.add(label);

        final JPanel redJPanel = new JPanel();
        redJPanel.setBackground(Color.RED);
        redJPanel.setBounds(0, 200, 200, 200);
        redJPanel.setLayout(new BorderLayout());
//        redJPanel.add(label);

        final JPanel blackJPanel = new JPanel();
        blackJPanel.setBackground(Color.BLACK);
        blackJPanel.setBounds(200, 0, 200, 400);
        blackJPanel.setLayout(new BorderLayout());
        blackJPanel.add(label);

        final JFrame frame = new JFrame();
        frame.add(cyanJPanel);
        frame.add(redJPanel);
        frame.add(blackJPanel);

        frame.setTitle("Testing JPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null); // Must use setBounds(...) for JPanels
        frame.setVisible(true);
    }
}
