package org.albert;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class App
{
    public static void main( String[] args )
    {
        final JPanel panel1 = new JPanel();
        final JPanel panel2 = new JPanel();
        final JPanel panel3 = new JPanel();
        final JPanel panel4 = new JPanel();
        final JPanel panel5 = new JPanel();

        panel1.setBackground(Color.BLACK);
        panel2.setBackground(Color.CYAN);
        panel3.setBackground(Color.RED);
        panel4.setBackground(Color.ORANGE);
        panel5.setBackground(Color.GREEN);

        var x = 100;
        var y = 100;
        panel1.setPreferredSize(new Dimension(x, y));
        panel2.setPreferredSize(new Dimension(x, y));
        panel3.setPreferredSize(new Dimension(x, y));
        panel4.setPreferredSize(new Dimension(x, y));
        panel5.setPreferredSize(new Dimension(x, y));

        final JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout(10, 10)); // hgap, vgap
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.WEST);
        frame.add(panel4, BorderLayout.EAST);
        frame.add(panel5, BorderLayout.CENTER);

        frame.getContentPane().setBackground(Color.WHITE);
        frame.setSize(700, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
