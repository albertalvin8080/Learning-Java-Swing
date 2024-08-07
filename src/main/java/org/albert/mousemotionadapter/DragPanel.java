package org.albert.mousemotionadapter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel
{
    private final ImageIcon imageIcon;
    private final Point imageCornerPoint;
    private Point previousPoint;

    public DragPanel()
    {
        // You don't need to add the imageIcon to this Panel because the
        // image is being painted inside the paintComponent(...) method.
        imageCornerPoint = new Point(100, 100); // This acts similar to setBounds(...); in this case.
        imageIcon = new ImageIcon("img.png");
        this.addMouseListener(new MousePressedListener());
        this.addMouseMotionListener(new MouseDraggedListener());
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        imageIcon.paintIcon(this, g, (int) imageCornerPoint.getX(), (int) imageCornerPoint.getY());
    }

    private class MousePressedListener extends MouseAdapter
    {
        @Override
        public void mousePressed(MouseEvent e)
        {
            previousPoint = e.getPoint();
        }
    }

    private class MouseDraggedListener extends MouseMotionAdapter
    {
        @Override
        public void mouseDragged(MouseEvent e)
        {
            Point currentPoint = e.getPoint();
            imageCornerPoint.translate(
                    (int) (currentPoint.getX() - previousPoint.getX()),
                    (int) (currentPoint.getY() - previousPoint.getY())
            );
            previousPoint = currentPoint;
            repaint();
        }
    }
}
