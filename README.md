# Email-Client-Software-in-Java

## Overview

This project is a basic email client software developed in Java. The application allows users to send, receive, and manage emails. It includes functionalities such as composing and sending emails, receiving and reading emails, and organizing emails into folders. Basic features like attaching files and formatting text are also implemented.

## Technologies used

- **Java**: Core programming language for application development.
- **JavaMail API**: Used for email functionality.
- **JavaBeans Activation Framework (JAF)**: Required for data content handling.
- **Swing** or **JavaFX**: Used for creating the user interface.

## Learning Outcomes
**By working on this project, you will learn:**

  -Java programming
  -JavaMail API usage
  -GUI development in Java (Swing or JavaFX)
  -Handling email protocols (IMAP, SMTP)

## Features

1. **Compose and Send Emails**: 
   - Send emails to multiple recipients.
   - Include subject and body text.
   - Attach files to emails.

2. **Receive and Read Emails**: 
   - Fetch emails from the server.
   - Display the subject and body of received emails.

3. **Manage Emails**: 
   - Organize emails into folders.
   - Move emails between folders.

4. **File Attachments**: 
   - Attach and send files with emails.
   - View attachments in received emails.

5. **Text Formatting**: 
   - Basic text formatting in email body (using HTML).

## Setup

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- IDE such as IntelliJ IDEA, Eclipse, or NetBeans.

### Dependencies

- `javax.mail API : javax.mail-api:1.6.2`
- `javax.activation framework(JAF) : javax.activation-api:1.2.0`

## Installation
1. **Clone the repository:**
    - git clone https://github.com/Vengadashan-S/Email-Client-Software-in-Java.git
    - cd Email-Client-Software-in-java
2. **Open the project in your preferred IDE.**
3. **Add the necessary jar files (javax.mail.jar and javax.activation.jar) to your project's build path**
4. **Configure your email credentials and SMTP/IMAP server details in EmailSender.java and EmailReceiver.java.**

# Execution Video Link
-Visit https://drive.google.com/file/d/1aynynZaSXkFe1sw_fAalvdiPxjlA-amE/view?usp=sharing to know how it works.

# Usage
1. **Run the Application:**
     -Open MainWindow.java.
     -Run the main method.
3. **Compose an Email:**
     -Click the Compose button.
     -Fill in the recipient's email address, subject, and body.
     -Click Send to send the email.
4. **Receive Emails:**
     -The inbox list will display received emails.
     -Click on an email to view its contents.
