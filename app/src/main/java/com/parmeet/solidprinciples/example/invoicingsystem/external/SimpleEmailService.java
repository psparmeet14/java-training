package com.parmeet.solidprinciples.example.invoicingsystem.external;

public class SimpleEmailService implements EmailService {
    @Override
    public void sendEmail(String to, String subject, String body) {
        System.out.println("Sending email to " + to + " with subject " + subject + " and body " + body);
    }
}
