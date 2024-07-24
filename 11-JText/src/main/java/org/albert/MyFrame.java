package org.albert;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame
{
    public MyFrame()
    {
        final JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(100, 30));
        textField.setBackground(Color.BLACK);
        textField.setForeground(Color.GREEN);
        textField.setCaretColor(Color.WHITE);
        textField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

        final JTextArea textArea = new JTextArea("Initial Text", 7, 20);
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.GREEN);
        textArea.setCaretColor(Color.WHITE);
        textArea.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        final JScrollPane jScrollPane = new JScrollPane(textArea);

        final JButton btn = new JButton("Send Message");
        btn.addActionListener(e -> {
            if (e.getSource() == btn)
            {
//                System.out.println(textField.getText());
//                textArea.setText(textArea.getText() + System.lineSeparator() + textField.getText());
                int position = textArea.getDocument().getLength();
                textArea.insert(System.lineSeparator() + textField.getText(), position);
            }
        });

        this.add(textField);
        this.add(btn);
//        this.add(textArea);
        this.add(jScrollPane);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        final MyFrame myFrame = new MyFrame();
    }
}
