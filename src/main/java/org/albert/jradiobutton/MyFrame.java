package org.albert.jradiobutton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener
{
    public MyFrame()
    {
        final JRadioButton mohg = new JRadioButton("mohg");
        final JRadioButton miquella = new JRadioButton("miquella");
        final JRadioButton malenia = new JRadioButton("malenia");

        final Image scaledInstance = new ImageIcon("mohg.jpg").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        final Image scaledInstance2 = new ImageIcon("img.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        mohg.setIcon(new ImageIcon(scaledInstance));
        mohg.setSelectedIcon(new ImageIcon(scaledInstance2));

        mohg.addActionListener(this);
        miquella.addActionListener(this);
        malenia.addActionListener(this);

        final ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(mohg);
        buttonGroup.add(miquella);
        buttonGroup.add(malenia);

        this.add(mohg);
        this.add(miquella);
        this.add(malenia);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500, 500);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() instanceof JRadioButton x)
        {
            System.out.println(x.getText() + " selected.");
        }
    }

    public static void main(String[] args)
    {
        new MyFrame();
    }

}
