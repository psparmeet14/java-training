package com.parmeet.solidprinciples.example.invoicingsystem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Invoice {
    private int id;
    private List<InvoiceItem> items;
}
