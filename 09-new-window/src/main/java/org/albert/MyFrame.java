package org.albert;

import javax.swing.*;
import java.awt.*;

public class MyFrame
{
    private final JFrame frame = new JFrame();
    private NewWindow newWindow;

    public MyFrame()
    {

        final JButton jButton = new JButton("Open new window");
        jButton.addActionListener(e -> {
            if(e.getSource() == jButton)
            {
                if (newWindow != null)
                    this.newWindow.dispose(); // Prevents creating multiple identical windows.
                this.newWindow = new NewWindow();
            }
        });

        frame.add(jButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static void main( String[] args )
    {
        final MyFrame myFrame = new MyFrame();
    }
}
