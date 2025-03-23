package com.parmeet.solidprinciples.example.invoicingsystem.service;

import com.parmeet.solidprinciples.example.invoicingsystem.external.EmailService;
import com.parmeet.solidprinciples.example.invoicingsystem.model.Invoice;

/**
 * Sends the formatted invoice via email. It depends on an abstraction for email sending
 * to keep it loosely coupled.
 */
public class InvoiceMailer {
    private EmailService emailService;

    // dependency injection ensures loose coupling
    public InvoiceMailer(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendInvoice(String recipient, Invoice invoice, String formattedInvoice) {
        String subject = "Your Invoice #" + invoice.getId();
        emailService.sendEmail(recipient, subject, formattedInvoice);
    }
}
