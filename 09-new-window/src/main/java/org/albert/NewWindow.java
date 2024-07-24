package org.albert;

import javax.swing.*;
import java.awt.*;

public class NewWindow extends JFrame
{
    public NewWindow()
    {
        final JLabel label = new JLabel("Mother, wouldst thou truly Lordship sanction in one so bereft of light?");
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBorder(BorderFactory.createEtchedBorder(Color.BLUE, Color.BLACK));

        this.add(label);

        // If you use EXIT_ON_CLOSE here, the program will end whenever you close the new window.
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        this.setSize(500, 500);
        this.setVisible(true);
    }
}
