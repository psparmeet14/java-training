package com.parmeet.solidprinciples.example.invoicingsystem.service.discount;

import com.parmeet.solidprinciples.example.invoicingsystem.model.Invoice;

public interface DiscountStrategy {
    // Calculates a discount based on the invoice.
    // The contract: the returned discount should be between 0 and the invoice total.
    double calculateDiscount(Invoice invoice);
}
