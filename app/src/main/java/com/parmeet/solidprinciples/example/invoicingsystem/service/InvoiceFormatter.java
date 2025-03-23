package com.parmeet.solidprinciples.example.invoicingsystem.service;

import com.parmeet.solidprinciples.example.invoicingsystem.model.Invoice;

public interface InvoiceFormatter {
    String formatInvoice(Invoice invoice, double total);
}
