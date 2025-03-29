package com.parmeet.solidprinciples.example.invoicingsystem;

import com.parmeet.solidprinciples.example.invoicingsystem.external.EmailService;
import com.parmeet.solidprinciples.example.invoicingsystem.external.SimpleEmailService;
import com.parmeet.solidprinciples.example.invoicingsystem.model.Invoice;
import com.parmeet.solidprinciples.example.invoicingsystem.model.InvoiceItem;
import com.parmeet.solidprinciples.example.invoicingsystem.service.*;
import com.parmeet.solidprinciples.example.invoicingsystem.service.calculator.InvoiceCalculator;
import com.parmeet.solidprinciples.example.invoicingsystem.service.formatter.HTMLInvoiceFormatter;
import com.parmeet.solidprinciples.example.invoicingsystem.service.formatter.InvoiceFormatter;
import com.parmeet.solidprinciples.example.invoicingsystem.service.formatter.PlainTextInvoiceFormatter;
import com.parmeet.solidprinciples.example.invoicingsystem.service.mailer.InvoiceMailer;

import java.util.List;

public class InvoicingSystemMain {
    public static void main(String[] args) {
        // Create invoice items
        InvoiceItem item1 = new InvoiceItem("Laptop", 1500.0);
        InvoiceItem item2 = new InvoiceItem("Mouse", 50.0);

        // Create the invoice
        Invoice invoice = new Invoice(1, List.of(item1, item2));

        // Calculate the total amount
        InvoiceCalculator calculator = new InvoiceCalculator();
        double total = calculator.calculateTotal(invoice);

        // Choose a formatter without modifying InvoiceCalculator or Invoice classes
        InvoiceFormatter formatter;

        // For example, decide based on context (user preferences, configuration, etc.)
        boolean useHTML = true; // This decision could be subjective
        if (useHTML) {
            formatter = new HTMLInvoiceFormatter();
        } else {
            formatter = new PlainTextInvoiceFormatter();
        }

        // Format the invoice
        String formattedInvoice = formatter.formatInvoice(invoice, total);

        // Send the invoice via email using a simple email service
        EmailService emailService = new SimpleEmailService();
        InvoiceMailer mailer = new InvoiceMailer(emailService);
        mailer.sendInvoice("a@a.com", invoice, formattedInvoice);
    }
}
