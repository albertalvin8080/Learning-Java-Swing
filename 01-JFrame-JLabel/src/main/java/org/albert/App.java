package org.albert;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class App
{
    public static void main( String[] args )
    {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
//        frame.setBackground(Color.BLACK);
        frame.getContentPane().setBackground(new Color(0x000000));
        ImageIcon frameIcon = new ImageIcon("img.png");
        frame.setIconImage(frameIcon.getImage());

        final JLabel label = new JLabel();
        label.setText("Mother, wouldst thou truly Lordship sanction in one so bereft of light?");
        // The position of the text relative to the icon
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(new Color(0xFFFFFF));
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setIcon(new ImageIcon("mohg.jpg"));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // If true the component paints every pixel within its bounds.
        // Remember that the default layout manager makes the label cover the entire JFrame.
//        label.setOpaque(true);
        label.setBounds(100, 100, 700, 500);

        final Border lineBorder = BorderFactory.createLineBorder(Color.RED, 2);
        label.setBorder(lineBorder);

        frame.add(label);
        // Overriding the default layout manager.
        // You must use label.setBounds(...) to display it.
        frame.setLayout(null);
        frame.setVisible(true); // Should be used by last.
//        frame.pack(); // Should be used by last. Doesn't work for frame.setLayout(null);.
    }
}
