package com.parmeet.solidprinciples.example.invoicingsystem.service;

import com.parmeet.solidprinciples.example.invoicingsystem.model.Invoice;
import com.parmeet.solidprinciples.example.invoicingsystem.service.calculator.InvoiceCalculator;
import com.parmeet.solidprinciples.example.invoicingsystem.service.discount.DiscountStrategy;

public class InvoiceProcessor {

    // Applies the given discount strategy to the invoice.
    // It expects that the discount value is valid (>= 0 and <= invoice total).
    public double applyDiscount(Invoice invoice, DiscountStrategy strategy) {
        double total = new InvoiceCalculator().calculateTotal(invoice);
        double discount = strategy.calculateDiscount(invoice);
        // Validate that the discount is withing acceptable bounds.
        if (discount < 0 || discount > total) {
            throw new IllegalArgumentException("Invalid discount calculated: " + discount));
        }
        return total - discount;
    }

    // Demonstrating LSP in Action
    // If we pass PercentageDiscountStrategy to InvoiceProcesses, everything works as expected.
    // But if we pass a poorly designed FixedDiscountStrategy (with, say, a discount greater than the invoice total),
    // the program's correctness is affected - it might throw an exception or produce incorrect results.
    // This shows that all subtypes of DiscountStrategy must honor the contract of returning a valid discount; otherwise,
    // they violate LSP.
}
