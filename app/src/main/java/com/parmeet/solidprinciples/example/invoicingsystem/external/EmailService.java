package com.parmeet.solidprinciples.example.invoicingsystem.external;

public interface EmailService {
    void sendEmail(String to, String subject, String body);
}
