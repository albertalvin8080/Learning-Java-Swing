package org.albert.jprogressbar;

import javax.swing.*;

public class MyFrame extends JFrame
{
    private final JProgressBar jProgressBar;

    public MyFrame()
    {
        // min, max
        jProgressBar = new JProgressBar(0, 100);
        jProgressBar.setValue(0);
        jProgressBar.setStringPainted(true); // Shows the percentage.
        jProgressBar.setBounds(0, 0, 500, 50);

        this.add(jProgressBar);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);

        progress();
    }

    private void progress()
    {
        int count = jProgressBar.getValue();
        while (count < 100)
        {
            try
            {
                count++;
                jProgressBar.setValue(count);
                Thread.sleep(50);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
        jProgressBar.setString("Done.");
    }

    public static void main(String[] args)
    {
        new MyFrame();
    }
}
