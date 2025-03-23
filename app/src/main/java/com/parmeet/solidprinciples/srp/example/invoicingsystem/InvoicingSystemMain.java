package com.parmeet.solidprinciples.srp.example.invoicingsystem;

import com.parmeet.solidprinciples.srp.example.invoicingsystem.external.EmailService;
import com.parmeet.solidprinciples.srp.example.invoicingsystem.external.SimpleEmailService;
import com.parmeet.solidprinciples.srp.example.invoicingsystem.model.Invoice;
import com.parmeet.solidprinciples.srp.example.invoicingsystem.model.InvoiceItem;
import com.parmeet.solidprinciples.srp.example.invoicingsystem.service.InvoiceCalculator;
import com.parmeet.solidprinciples.srp.example.invoicingsystem.service.InvoiceFormatter;
import com.parmeet.solidprinciples.srp.example.invoicingsystem.service.InvoiceMailer;

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

        // Format the invoice
        InvoiceFormatter formatter = new InvoiceFormatter();
        String formattedInvoice = formatter.formatInvoice(invoice, total);

        // Send the invoice via email using a simple email service
        EmailService emailService = new SimpleEmailService();
        InvoiceMailer mailer = new InvoiceMailer(emailService);
        mailer.sendInvoice("a@a.com", invoice, formattedInvoice);
    }
}
