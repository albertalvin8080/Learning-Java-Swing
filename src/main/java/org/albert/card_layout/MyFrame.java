package org.albert.card_layout;

import javax.swing.*;
import java.awt.*;

public class MyFrame
{
    private final JFrame frame = new JFrame();
    private final JPanel panelContainer = new JPanel();
    private final JPanel panel1 = new JPanel();
    private final JPanel panel2 = new JPanel();
    private final CardLayout cl = new CardLayout();

    public MyFrame()
    {
        panelContainer.setLayout(this.cl);
        // child component, string identifier
        panelContainer.add(panel1, "1");
        panelContainer.add(panel2, "2");

        panel1.setBackground(Color.BLUE);
        panel2.setBackground(Color.RED);

        final JButton btn1 = new JButton("Switch to panel 2");
        btn1.addActionListener(e -> this.cl.show(this.panelContainer, "2"));
        btn1.setFocusable(false);

        final JButton btn2 = new JButton("Switch to panel 1");
        btn2.setFocusable(false);
        btn2.addActionListener(e -> this.cl.show(this.panelContainer, "1"));

        panel1.setLayout(new GridBagLayout());
        final GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
//        gbc.weightx = 1;
        gbc.weighty = 1; // Needs weighty for using NORTH property
        gbc.anchor = GridBagConstraints.NORTH;

        panel1.add(btn1, gbc);
        panel2.add(btn2);

        // parent component, child identifier
        cl.show(panelContainer, "1");

        frame.add(panelContainer);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        final MyFrame myFrame = new MyFrame();
    }
}
