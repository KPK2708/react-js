package com.wipro.java.microservices.d;

public class TestDIP {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SmsSender();

        NotificationService emailNotification = new NotificationService(emailSender);
        NotificationService smsNotification = new NotificationService(smsSender);

        emailNotification.sendNotification("Hello via Email!");
        smsNotification.sendNotification("Hello via SMS!");
    }
}
