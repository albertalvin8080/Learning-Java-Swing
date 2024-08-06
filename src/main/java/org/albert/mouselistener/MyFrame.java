package org.albert.mouselistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener
{
    private final JLabel label;

    public MyFrame()
    {
        label = new JLabel();
        label.setPreferredSize(new Dimension(200, 200));
        label.setOpaque(true);
        label.setBackground(Color.RED);
        label.addMouseListener(this);

        this.add(label);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridBagLayout());
        this.setSize(500, 500);
        this.setVisible(true);
    }

    @Override
    // pressed + released
    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        label.setBackground(Color.YELLOW);
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        label.setBackground(Color.BLUE);
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        label.setBackground(Color.GRAY);
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        label.setBackground(Color.RED);
    }

    public static void main(String[] args)
    {
        new MyFrame();
    }
}
