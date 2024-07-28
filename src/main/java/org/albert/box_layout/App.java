package org.albert.box_layout;

import javax.swing.*;
import java.awt.*;

public class App
{
    public static void main(String[] args)
    {
        final JFrame frame = new JFrame();
//        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
//        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.LINE_AXIS));
//        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        final JButton btn1 = new JButton("btn 1");
        final JButton btn2 = new JButton("btn 2");

        // A Glue component is used to fill the space which is not used by any component.
        // We can use it to push a component to the end of the row/column.
        frame.add(Box.createVerticalGlue());
        frame.add(btn1);
        // A Rigid Area is meant to act as padding between components.
        frame.add(Box.createRigidArea(new Dimension(0, 20)));
//        frame.add(Box.createRigidArea(new Dimension(20, 20)));
        frame.add(btn2);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
