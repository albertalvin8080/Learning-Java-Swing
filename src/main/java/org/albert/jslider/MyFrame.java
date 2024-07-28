package org.albert.jslider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MyFrame extends JFrame implements ChangeListener
{
    private final JSlider jSlider;
    private final JLabel jLabel;

    public MyFrame()
    {
        int initial = 50;
        // min, max, value (initial value)
        jSlider = new JSlider(0, 100, initial);
        jSlider.setOrientation(SwingConstants.VERTICAL);

        jSlider.setPaintTicks(true);
        jSlider.setMinorTickSpacing(5);

        jSlider.setPaintTrack(true);
        jSlider.setMajorTickSpacing(25);

        jSlider.setPaintLabels(true);

        jLabel = new JLabel("°C = " + initial);
        jSlider.addChangeListener(this);

        final JPanel jPanel = new JPanel();
        // Makes the jLabel to be placed on the next line.
        jSlider.setPreferredSize(new Dimension(500, 200));
        jPanel.add(jSlider);
        jPanel.add(jLabel);

        this.add(jPanel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLayout(new FlowLayout());
        this.setSize(500, 500);
        this.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e)
    {
        if (e.getSource() == jSlider)
        {
            this.jLabel.setText("°C = " + jSlider.getValue());
        }
    }

    public static void main(String[] args)
    {
        new MyFrame();
    }
}
