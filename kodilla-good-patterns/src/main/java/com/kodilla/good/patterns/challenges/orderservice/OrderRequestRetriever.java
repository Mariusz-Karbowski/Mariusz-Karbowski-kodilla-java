package com.kodilla.good.patterns.challenges.orderservice;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Customer customer = new Customer("Jan23", "Jan", "Nowak");
        LocalDate orderDate = LocalDate.of(2021, 01, 15);
        Product product = new Product("Mug", 1, 15);

        return new OrderRequest(customer, orderDate, product);
    }
}
