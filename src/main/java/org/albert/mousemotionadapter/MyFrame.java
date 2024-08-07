package org.albert.mousemotionadapter;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame
{
    private final DragPanel dragPanel;

    public MyFrame()
    {
        dragPanel = new DragPanel();
        dragPanel.setPreferredSize(new Dimension(800, 700));
//        dragPanel.setBackground(Color.BLACK);
        dragPanel.setOpaque(true);

        this.add(dragPanel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLocationRelativeTo(null);
        this.setLayout(new GridBagLayout());
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setSize(1000, 1000);
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        new MyFrame();
    }
}
