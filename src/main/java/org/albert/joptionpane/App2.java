package org.albert.joptionpane;

import javax.swing.*;

public class App2
{
    public static void main(String[] args)
    {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);  // Centers the frame on the screen
        frame.setVisible(true);

        /*
        * - Modal Behavior: The dialog will be modal with respect to the parent frame, meaning it will block input to the parent frame until the dialog is dismissed.
        * - Window Focus: The dialog will be centered relative to the parent frame, making it easier for the user to see.
        * - Ownership: The dialog will be owned by the parent frame, meaning it will stay on top of the parent frame and will be minimized/restored along with the parent frame.
        * */
        JOptionPane.showMessageDialog(frame, "Mother, wouldst thou truly Lordship sanction in one so bereft of light?");
    }
}
