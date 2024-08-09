package org.albert.graphics2d.animation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener
{
    private final int WIDTH = 800;
    private final int HEIGHT = 800;
    private final Image backgroundImage;
    private final Image entity;
    private final Timer timer;

    private int x = 0;
    private int xVelocity = 10;
    private int y = 0;
    private int yVelocity = 15;

    public MyPanel()
    {
        backgroundImage = new ImageIcon("spacetime.png").getImage().getScaledInstance(WIDTH, HEIGHT, Image.SCALE_SMOOTH);
        entity = new ImageIcon("img.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(backgroundImage, 0, 0, this);
        g2d.drawImage(entity, x, y, this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (x >= WIDTH - entity.getWidth(this) || x < 0)
        {
            xVelocity = -xVelocity;
        }
        if (y >= HEIGHT - entity.getHeight(this) || y < 0)
        {
            yVelocity = -yVelocity;
        }

        System.out.println(x);
        System.out.println(y);
        System.out.println("--------------------------");

        x += xVelocity;
        y += yVelocity;
        repaint();
    }
}
