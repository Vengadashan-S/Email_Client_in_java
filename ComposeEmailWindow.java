package com.example.ui;

import com.example.EmailSender;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComposeEmailWindow extends JFrame {
    private JTextField toField;
    private JTextField subjectField;
    private JEditorPane bodyPane;
    private JButton sendButton;
    private JButton attachButton;
    private String attachmentPath = null;

    public ComposeEmailWindow() {
        setTitle("Compose Email");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.BLUE);
        JPanel fieldsPanel = new JPanel(new GridLayout(3, 1));
        fieldsPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        fieldsPanel.setBackground(Color.LIGHT_GRAY);
        toField = new JTextField();
        subjectField = new JTextField();
        fieldsPanel.add(new JLabel("To:"));
        fieldsPanel.add(toField);
        fieldsPanel.add(new JLabel("Subject:"));
        fieldsPanel.add(subjectField);

        panel.add(fieldsPanel, BorderLayout.NORTH);

        bodyPane = new JEditorPane();
        bodyPane.setContentType("text/html");
        panel.add(new JScrollPane(bodyPane), BorderLayout.CENTER);

        JPanel buttonsPanel = new JPanel();
        sendButton = new JButton("Send");
        buttonsPanel.setBackground(Color.LIGHT_GRAY);
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String to = toField.getText();
                String subject = subjectField.getText();
                String body = bodyPane.getText();

                EmailSender sender = new EmailSender();
                sender.sendEmail(to, subject, body, attachmentPath);
                JOptionPane.showMessageDialog(null, "Email sent successfully!");
                dispose();
            }
        });
        buttonsPanel.add(sendButton);

        toField.setBackground(Color.WHITE);
        subjectField.setBackground(Color.WHITE);
        bodyPane.setBackground(Color.WHITE);
        sendButton.setBackground(Color.BLUE);
        attachButton = new JButton("Attach File");
        attachButton.setBackground(Color.CYAN);
        attachButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    attachmentPath = fileChooser.getSelectedFile().getAbsolutePath();
                }
            }
        });
        buttonsPanel.add(attachButton);

        panel.add(buttonsPanel, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }
}
