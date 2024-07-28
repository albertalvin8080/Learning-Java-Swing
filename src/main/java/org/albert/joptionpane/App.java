package org.albert.joptionpane;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class App
{
    public static void main(String[] args)
    {
//        JOptionPane.showMessageDialog(null, "I'm the message", "title", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "I'm the message", "title", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "I'm the message", "title", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "I'm the message", "title", JOptionPane.ERROR_MESSAGE);

//        final int i = JOptionPane.showConfirmDialog(null, "Confirm something", "title", JOptionPane.YES_NO_CANCEL_OPTION);
//        System.out.println(i);

//        String s = JOptionPane.showInputDialog(null, "Say something", "default message");
//        String s = JOptionPane.showInputDialog(null, "Say something", "cool title", JOptionPane.PLAIN_MESSAGE);
//        System.out.println(s);

        JOptionPane.showOptionDialog(
                null,
                "Cool message",
                "cool title",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                new ImageIcon(new ImageIcon("mohg.jpg").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)),
                new String[]{"YES!", "NONO"},
                0
        );
    }
}
