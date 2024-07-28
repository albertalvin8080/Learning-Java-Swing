package org.albert.jcombobox;

import javax.swing.*;
import java.awt.*;

public class App
{
    public static void main(String[] args)
    {
        String[] names = {"Franz Bonaparta", "Emil Sebe", "Helmuth Voss"};
        final JComboBox<String> comboBox = new JComboBox<>(names);
//        comboBox.setSelectedIndex(1);
//        comboBox.removeItemAt(0);
        comboBox.insertItemAt("Klaus Poppe", 1);

        comboBox.addActionListener(e -> {
            if (e.getSource() == comboBox)
            {
//                System.out.println(comboBox.getSelectedItem());
                System.out.println(comboBox.getSelectedIndex());
            }
        });

        final JFrame frame = new JFrame();
        frame.add(comboBox);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
