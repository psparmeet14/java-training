package com.parmeet.solidprinciples.srp.example.invoicingsystem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

// Represents an item on the invoice
@AllArgsConstructor
@Getter
public class InvoiceItem {
    private String description;
    private double price;
}
