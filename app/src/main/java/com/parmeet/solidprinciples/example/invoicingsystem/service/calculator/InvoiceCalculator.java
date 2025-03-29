package com.parmeet.solidprinciples.example.invoicingsystem.service.calculator;

import com.parmeet.solidprinciples.example.invoicingsystem.model.Invoice;
import com.parmeet.solidprinciples.example.invoicingsystem.model.InvoiceItem;

/**
 * Calculates the total amount of an invoice
 */
public class InvoiceCalculator {

    // Only responsible for calculating the invoice total
    public double calculateTotal(Invoice invoice) {
        double total = 0;
        for (InvoiceItem item : invoice.getItems()) {
            total += item.getPrice();
        }
        return total;
    }
}
