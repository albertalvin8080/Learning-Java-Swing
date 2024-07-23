package org.albert;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener
{
    final JButton jButton;
    final JLabel label;

    public MyFrame()
    {
        ImageIcon icon = new ImageIcon("mohg.jpg");
        // Resize the image to fit the button
        Image img = icon.getImage();
        Image resizedImage = img.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        jButton = new JButton();
        jButton.setText("click me");
        // You could also pass a lambda or a method reference.
        jButton.addActionListener(this);
//        jButton.addActionListener(this::actionPerformed); // Unnecessary, but also works.
        jButton.setBorder(BorderFactory.createEtchedBorder());
        jButton.setBackground(Color.LIGHT_GRAY);
        jButton.setIcon(resizedIcon);
        jButton.setBounds(0, 0, 100, 40);
        jButton.setHorizontalTextPosition(JButton.LEFT);
        jButton.setVerticalTextPosition(JButton.CENTER);

        label = new JLabel("You clicked the button!");
        label.setBounds(0, 100, 300, 100);
        label.setVisible(false);

        this.add(label);
        this.add(jButton);
        this.setTitle("Testing JButton");
        this.setSize(500, 500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == this.jButton)
        {
            System.out.println("Button clicked");
            this.label.setVisible(!this.label.isVisible());
//            this.jButton.setEnabled(false);
        }
    }
}
