package com.example.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private JPanel mainPanel;
    private JButton composeButton;
    private JList<String> inboxList;

    public MainWindow() {
        setTitle("Email Client");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.LIGHT_GRAY);

        inboxList = new JList<>();
        inboxList.setBackground(Color.pink);
        mainPanel.add(new JScrollPane(inboxList), BorderLayout.CENTER);

        composeButton = new JButton("Compose");
        composeButton.setBackground(Color.LIGHT_GRAY);
        composeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ComposeEmailWindow();
            }
        });
        mainPanel.add(composeButton, BorderLayout.NORTH);

        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow();
            }
        });
    }
}
