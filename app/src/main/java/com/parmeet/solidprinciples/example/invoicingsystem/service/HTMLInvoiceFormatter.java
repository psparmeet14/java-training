package com.parmeet.solidprinciples.example.invoicingsystem.service;

import com.parmeet.solidprinciples.example.invoicingsystem.model.Invoice;
import com.parmeet.solidprinciples.example.invoicingsystem.model.InvoiceItem;

public class HTMLInvoiceFormatter implements InvoiceFormatter {

    @Override
    public String formatInvoice(Invoice invoice, double total) {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body>");
        sb.append("<h1>Invoice</h1>");
        sb.append("<p>Invoice ID: ").append(invoice.getId()).append("</p>");
        sb.append("<ul>");
        for (InvoiceItem item : invoice.getItems()) {
            sb.append("<li>")
                    .append(item.getDescription())
                    .append(" - ")
                    .append(item.getPrice())
                    .append("</li>");
        }
        sb.append("</ul>");
        sb.append("<p>Total: ").append(total).append("</p>");
        sb.append("</body></html>");
        return sb.toString();
    }
}
