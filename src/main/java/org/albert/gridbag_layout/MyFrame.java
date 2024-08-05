package org.albert.gridbag_layout;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame
{
    public MyFrame()
    {
        this.setLayout(new GridBagLayout());

        final JButton btn1 = new JButton("btn 1");
        final JButton btn2 = new JButton("btn 2");
        final JButton btn3 = new JButton("btn 3");
        final JButton btn4 = new JButton("btn 4");
        final JButton btn5 = new JButton("btn 5");

        final GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(btn3, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
//        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.weighty = 1;
        this.add(btn1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
//        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.weighty = 0;
        this.add(btn2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        this.add(btn4, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
//        gbc.fill = GridBagConstraints.NONE;
        gbc.fill = GridBagConstraints.BOTH;
        // Use REMAINDER to specify that the component's display area will be from gridy to the last cell in the column.
        gbc.gridheight = GridBagConstraints.REMAINDER;
        gbc.weightx = 0;
        gbc.weighty = 0;
        this.add(btn5, gbc);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(500, 500);
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        new MyFrame();
    }
}
