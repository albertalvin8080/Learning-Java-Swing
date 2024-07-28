package org.albert.jlayeredpane;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class App
{
    public static void main(String[] args)
    {
        final JLabel label1 = new JLabel();
        final JLabel label2 = new JLabel();
        final JLabel label3 = new JLabel();

        label1.setBackground(Color.GREEN);
        label2.setBackground(Color.BLUE);
        label3.setBackground(Color.BLACK);

        label1.setBounds(50, 50, 200, 200);
        label2.setBounds(100, 100, 200, 200);
        label3.setBounds(150, 150, 200, 200);

        label1.setOpaque(true);
        label2.setOpaque(true);
        label3.setOpaque(true);

        final JLayeredPane jLayeredPane = new JLayeredPane();
        jLayeredPane.setBounds(0, 0, 500, 500);
        // Layers in ascending order: Default, Palette, Modal, PopUp, Drag
        jLayeredPane.add(label1, JLayeredPane.POPUP_LAYER);
        jLayeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.add(label3, JLayeredPane.MODAL_LAYER);

        final JFrame frame = new JFrame();
        frame.add(jLayeredPane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
