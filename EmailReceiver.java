package com.example;

import javax.mail.*;
import javax.mail.search.FlagTerm;
import java.util.Properties;

public class EmailReceiver {
    private final String username = "vengadashanshanmugam2003@gmail.com";
    private final String password = "Vengi@30072003";
    private final String host = "imap.example.com";

    public void receiveEmails() {
        Properties properties = new Properties();
        properties.put("mail.store.protocol", "imaps");

        try {
            Session session = Session.getDefaultInstance(properties, null);
            Store store = session.getStore();
            store.connect(host, username, password);

            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);

            Message[] messages = inbox.search(new FlagTerm(new Flags(Flags.Flag.SEEN), false));
            for (Message message : messages) {
                System.out.println("Email Subject: " + message.getSubject());
                System.out.println("Email Body: " + message.getContent().toString());
            }

            inbox.close(false);
            store.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
