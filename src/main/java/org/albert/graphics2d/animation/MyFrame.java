package org.albert.graphics2d.animation;

import javax.swing.*;

public class MyFrame extends JFrame
{
    private final MyPanel panel;

    public MyFrame()
    {
        panel = new MyPanel();
        this.add(panel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        new MyFrame();
    }
}
