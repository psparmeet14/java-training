package com.parmeet.solidprinciples.example.invoicingsystem.service.formatter;

import com.parmeet.solidprinciples.example.invoicingsystem.model.Invoice;
import com.parmeet.solidprinciples.example.invoicingsystem.model.InvoiceItem;
import com.parmeet.solidprinciples.example.invoicingsystem.service.formatter.InvoiceFormatter;

/**
 * Formats an invoice into a printable string
 */
public class PlainTextInvoiceFormatter implements InvoiceFormatter {

    // Only responsible for formatting the invoice details
    @Override
    public String formatInvoice(Invoice invoice, double total) {
        StringBuilder builder = new StringBuilder();
        builder.append("Invoice #").append(invoice.getId()).append("\n");
        for (InvoiceItem item : invoice.getItems()) {
            builder.append(item.getDescription())
                    .append(" $")
                    .append(item.getPrice())
                    .append("\n");
        }
        builder.append("Total: $").append(total);
        return builder.toString();
    }
}
