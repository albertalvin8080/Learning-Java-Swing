package org.albert.grid_layout;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class App
{
    public static void main(String[] args)
    {
        final JButton[] jButtons = {
                new JButton("1"), new JButton("2"), new JButton("3"),
                new JButton("4"), new JButton("5"), new JButton("6"),
                new JButton("7"), new JButton("8"), new JButton("9"),
                new JButton("10"), new JButton("11"), new JButton("12"),
        };

        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        // rows, cols, hgap, vgap
        frame.setLayout(new GridLayout(3, 4, 0, 0));

        for (JButton jButton : jButtons)
        {
            frame.add(jButton);
        }

        frame.setVisible(true);
    }
}
