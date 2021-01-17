package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequest {

    private Customer customer;
    private Product product;

    public OrderRequest(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }
}
