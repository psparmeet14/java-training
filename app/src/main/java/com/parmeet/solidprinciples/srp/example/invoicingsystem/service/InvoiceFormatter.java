package com.parmeet.solidprinciples.srp.example.invoicingsystem.service;

import com.parmeet.solidprinciples.srp.example.invoicingsystem.model.Invoice;
import com.parmeet.solidprinciples.srp.example.invoicingsystem.model.InvoiceItem;

/**
 * Formats an invoice into a printable string
 */
public class InvoiceFormatter {

    // Only responsible for formatting the invoice details
    public String formatInvoice(Invoice invoice, double total) {
        StringBuilder builder = new StringBuilder();
        builder.append("Invoice #").append(invoice.getId()).append("\n");
        for (InvoiceItem item : invoice.getItems()) {
            builder.append(item.getDescription()).append(" $").append(item.getPrice()).append("\n");
        }
        builder.append("Total: $").append(total);
        return builder.toString();
    }
}
