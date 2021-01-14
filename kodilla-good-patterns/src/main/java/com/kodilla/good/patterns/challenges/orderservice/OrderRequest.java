package com.kodilla.good.patterns.challenges.orderservice;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequest {
    private Customer customer;
    private LocalDate orderDate;
    private Product product;

    public OrderRequest(Customer customer, LocalDate orderDate, Product product) {
        this.customer = customer;
        this.orderDate = orderDate;
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getOrderDate() { return orderDate; }

    public Product getProduct() {
        return product;
    }
}
