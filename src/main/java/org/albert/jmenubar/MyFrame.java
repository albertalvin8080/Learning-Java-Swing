package org.albert.jmenubar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener
{
    private final JMenuBar jMenuBar;
    private final JMenu fileMenu;
    private final JMenu editMenu;
    private final JMenu helpMenu;
    private final JMenuItem loadItem;
    private final JMenuItem saveItem;
    private final JMenuItem exitItem;

    public MyFrame()
    {
        final Image scaledInstance = new ImageIcon("mohg.jpg").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        final Image scaledInstance2 = new ImageIcon("img.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);

        loadItem = new JMenuItem("Load");
        loadItem.setIcon(new ImageIcon(scaledInstance));
        loadItem.addActionListener(this);
        loadItem.setMnemonic(KeyEvent.VK_L); // l

        saveItem = new JMenuItem("Save");
        saveItem.setIcon(new ImageIcon(scaledInstance2));
        saveItem.addActionListener(this);
        saveItem.setMnemonic(KeyEvent.VK_S); // s

        exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(this);
        exitItem.setMnemonic(KeyEvent.VK_E); // e

        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e

        helpMenu = new JMenu("Help");
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h

        jMenuBar = new JMenuBar();
        jMenuBar.add(fileMenu);
        jMenuBar.add(editMenu);
        jMenuBar.add(helpMenu);

        this.setJMenuBar(jMenuBar);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        final Object source = e.getSource();
        if (source == loadItem)
        {
            System.out.println("*Loading something*");
        }
        else if (source == saveItem)
        {
            System.out.println("*Saving something*");
        }
        else if (source == exitItem)
        {
            final int i = JOptionPane.showConfirmDialog(this, "Are you sure?", "Cool title", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (i == 0)
                System.exit(0);
        }
    }

    public static void main(String[] args)
    {
        new MyFrame();
    }
}
