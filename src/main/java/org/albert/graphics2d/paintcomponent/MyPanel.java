package org.albert.graphics2d.paintcomponent;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel
{
    private final Image image;

    public MyPanel()
    {
        image = new ImageIcon("mohg.jpg").getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        this.setPreferredSize(new Dimension(500, 500));
        /*
        * NOTE: Setting the border doesn't work if you override the paint(...) method because
        *       it's used for handling borders and child components. You'd have to do it manually.
        *       Instead, use paintComponent(...) for solely drawing this component's content.
        * */
//        this.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
    }

    @Override
    public void paintComponent(Graphics g)
    {
        // NOTE: Remember to use frame.pack(); in the parent JFrame for an accurate drawing.
        Graphics2D g2d = (Graphics2D) g;

        /*
         * The ImageObserver interface is used for asynchronous image loading in Java. When an image is being drawn,
         * especially from an external source like a file, the loading might not be instantaneous. The ImageObserver
         * helps handle the process of updating the display as the image is being loaded.
         * */
        g2d.drawImage(image, 0, 0, this); // "this" is the ImageObserver in this case.

        g2d.setPaint(Color.BLUE);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawLine(0, 0, 500, 500);

        g2d.drawRect(0, 0, 100, 200);
        g2d.setPaint(Color.PINK);
        g2d.fillRect(400, 0, 100, 200);

        g2d.setPaint(Color.CYAN);
        int[] xPoints = {200, 300, 400};
//        int[] yPoints = {300, 200, 300};
        int[] yPoints = {200, 200, 300};
//        g2d.drawPolygon(xPoints, yPoints, 3);
        g2d.fillPolygon(xPoints, yPoints, 3);

        g2d.drawArc(100, 300, 100, 100, 0, 180);
        g2d.fillArc(100, 300, 100, 100, 180, 180);

        g2d.setPaint(Color.WHITE);
        g2d.setFont(new Font("Arial", Font.ITALIC, 10));
        g2d.drawString("Mother, wouldst thou truly Lordship sanction in one so bereft of light?", 100, 460);
    }
}
