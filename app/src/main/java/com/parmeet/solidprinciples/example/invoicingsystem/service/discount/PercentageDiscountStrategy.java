package com.parmeet.solidprinciples.example.invoicingsystem.service.discount;

import com.parmeet.solidprinciples.example.invoicingsystem.model.Invoice;
import com.parmeet.solidprinciples.example.invoicingsystem.service.calculator.InvoiceCalculator;

public class PercentageDiscountStrategy implements DiscountStrategy {
    private final double percentage; // e.g., 0.1 for 10%

    public PercentageDiscountStrategy(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double calculateDiscount(Invoice invoice) {
        // Use our existing calculator to get the total.
        double total = new InvoiceCalculator().calculateTotal(invoice);
        return total * percentage;
    }
}
