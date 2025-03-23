package com.parmeet.solidprinciples.srp.example.invoicingsystem.external;

public interface EmailService {
    void sendEmail(String to, String subject, String body);
}
