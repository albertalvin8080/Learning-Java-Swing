package org.albert;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class App
{
    public static void main(String[] args)
    {
        JButton[] jButtons = new JButton[]{
                new JButton("1"), new JButton("2"), new JButton("3"),
                new JButton("4"), new JButton("5"), new JButton("6"),
                new JButton("7"), new JButton("8"), new JButton("9"),
        };

        final JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 20));
        jPanel.setBackground(Color.LIGHT_GRAY);
        jPanel.setPreferredSize(new Dimension(260, 260));

        final JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // align, hgap, vgap
        frame.setSize(700, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (JButton jButton : jButtons)
        {
//            jButton.setPreferredSize(new Dimension(100, 40));
//            frame.add(jButton);
            jPanel.add(jButton);
        }
        frame.add(jPanel);
        frame.setVisible(true);
    }
}
