package com.example;

import javax.mail.*;
import java.util.Properties;

public class FolderManager {
    private final String username = "your-email@example.com";
    private final String password = "your-password";
    private final String host = "imap.example.com";

    public FolderManager() {
    }

    public void moveEmail(String emailId, String sourceFolder, String targetFolder) {
        Properties properties = new Properties();
        properties.put("mail.store.protocol", "imaps");

        try {
            Session session = Session.getDefaultInstance(properties, null);
            Store store = session.getStore();
            store.connect(host, username, password);

            Folder source = store.getFolder(sourceFolder);
            source.open(Folder.READ_WRITE);

            Folder target = store.getFolder(targetFolder);
            if (!target.exists()) {
                target.create(Folder.HOLDS_MESSAGES);
            }
            target.open(Folder.READ_WRITE);

            Message message = source.getMessage(Integer.parseInt(emailId));
            source.copyMessages(new Message[]{message}, target);
            message.setFlag(Flags.Flag.DELETED, true);

            source.close(true);
            target.close(false);
            store.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
