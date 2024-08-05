package org.albert.keylistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener
{
    private final JLabel label;

    public MyFrame()
    {
        this.addKeyListener(this);

        final Image scaledInstance = new ImageIcon("img.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        label = new JLabel(new ImageIcon(scaledInstance));
        label.setBounds(0, 0, 40, 40);
//        label.setBackground(Color.BLACK);

        this.add(label);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e)
    {

    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        switch (e.getKeyCode())
        {
            case KeyEvent.VK_W -> label.setLocation(label.getX(), label.getY() - 10);
            case KeyEvent.VK_S -> label.setLocation(label.getX(), label.getY() + 10);
            case KeyEvent.VK_A -> label.setLocation(label.getX() - 10, label.getY());
            case KeyEvent.VK_D -> label.setLocation(label.getX() + 10, label.getY());
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        System.out.println(e.getKeyChar());
        // The KeyCode is NOT case-sensitive.
        System.out.println(e.getKeyCode());
    }

    public static void main(String[] args)
    {
        new MyFrame();
    }
}
