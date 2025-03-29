package com.parmeet.solidprinciples.example.invoicingsystem.service.discount;

import com.parmeet.solidprinciples.example.invoicingsystem.model.Invoice;
import com.parmeet.solidprinciples.example.invoicingsystem.service.calculator.InvoiceCalculator;

public class FixedDiscountStrategy implements DiscountStrategy {
    private final double discountValue;

    public FixedDiscountStrategy(double discountValue) {
        this.discountValue = discountValue;
    }

    @Override
    public double calculateDiscount(Invoice invoice) {
        double total = new InvoiceCalculator().calculateTotal(invoice);
        // Ensure the discount is not more than the total.
        return Math.min(discountValue, total);
    }

//    @Override
//    public double calculateDiscount(Invoice invoice) {
//        // A potential issue: if discountValue > invoice total,
//        // it violates the expectation (contract) that the discount is between 0 and the total.
//        return discountValue;
//    }
}
