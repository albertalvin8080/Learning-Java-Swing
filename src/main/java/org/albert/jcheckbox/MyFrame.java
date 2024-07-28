package org.albert.jcheckbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyFrame extends JFrame implements ActionListener
{
    private final JCheckBox[] jCheckBox;
    private final JButton btn;

    public MyFrame()
    {
        jCheckBox = new JCheckBox[2];

        jCheckBox[0] = new JCheckBox();
        jCheckBox[0].setText("Mohg, lord of blood");
        jCheckBox[0].setFocusable(false);
        final Image scaledInstance = new ImageIcon("mohg.jpg").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        final Image scaledInstance2 = new ImageIcon("img.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        jCheckBox[0].setIcon(new ImageIcon(scaledInstance));
        // setSelectedIcon() needs setIcon() to work.
        jCheckBox[0].setSelectedIcon(new ImageIcon(scaledInstance2));

        jCheckBox[1] = new JCheckBox();
        jCheckBox[1].setText("Midra, lord of frenzied flame");
        jCheckBox[1].setFocusable(false);

        final JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        jPanel.add(jCheckBox[0]);
        jPanel.add(jCheckBox[1]);

        btn = new JButton("Submit");
        btn.addActionListener(this);
        btn.setFocusable(false);

        this.add(btn);
        this.add(jPanel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500, 500);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == this.btn)
        {
            final String collect = Stream.of(jCheckBox)
                    .map(box -> Boolean.valueOf(box.isSelected()).toString())
                    .collect(Collectors.joining(" "));
            System.out.println(collect);
        }
    }

    public static void main( String[] args )
    {
        new MyFrame();
    }


}
