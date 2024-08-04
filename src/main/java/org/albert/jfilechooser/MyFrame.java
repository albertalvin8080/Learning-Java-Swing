package org.albert.jfilechooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener
{
    private final JButton jButton;

    public MyFrame()
    {
        jButton = new JButton("Select file");
        jButton.addActionListener(this);

        this.add(jButton);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500, 500);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == jButton)
        {
            final JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.setCurrentDirectory(new File("."));

//            final int response = jFileChooser.showOpenDialog(this);
            final int response = jFileChooser.showSaveDialog(this);

            if (response == JFileChooser.APPROVE_OPTION)
            {
                System.out.println(jFileChooser.getSelectedFile().getAbsolutePath());
            }
        }
    }

    public static void main(String[] args)
    {
        new MyFrame();
    }
}
