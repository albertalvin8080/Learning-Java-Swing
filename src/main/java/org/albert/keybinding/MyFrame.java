package org.albert.keybinding;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame
{
    private final JPanel panel;

    public MyFrame()
    {
        panel = new JPanel();
        panel.setBackground(Color.RED);
        panel.setBounds(100, 100, 200, 200);
//        panel.setPreferredSize(new Dimension(200, 200));

        final InputMap panelInputMap = panel.getInputMap();
        final ActionMap panelActionMap = panel.getActionMap();

        // InputMap  -> Map an input (KeyStroke) to a string.
        // ActionMap -> Map the same string to an action.
        panelInputMap.put(KeyStroke.getKeyStroke("UP"), "upAction");
        panelActionMap.put("upAction", new UpAction());
        panelInputMap.put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        panelActionMap.put("downAction", new DownAction());
        panelInputMap.put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        panelActionMap.put("leftAction", new LeftAction());
        panelInputMap.put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        panelActionMap.put("rightAction", new RightAction());

        this.add(panel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 1000);
        this.setLayout(null);
        this.setVisible(true);
    }

    private class UpAction extends AbstractAction
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            panel.setLocation(panel.getX(), panel.getY() - 10);
        }
    }

    private class DownAction extends AbstractAction
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            panel.setLocation(panel.getX(), panel.getY() + 10);
        }
    }

    private class LeftAction extends AbstractAction
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            panel.setLocation(panel.getX() - 10, panel.getY());
        }
    }

    private class RightAction extends AbstractAction
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            panel.setLocation(panel.getX() + 10, panel.getY());
        }
    }

    public static void main(String[] args)
    {
        new MyFrame();
    }
}
