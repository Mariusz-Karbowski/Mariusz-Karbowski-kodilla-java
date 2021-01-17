package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequestRetriever {
    public OrderRequest retriever() {
        Customer customer = new Customer("Jan", "Nowak", "jan23@gmail.com", "ul. Kowalska 23, 22-333 Janów");
        Product product = new Product("Olive oil 250ml", 5, 19.99);
        return new OrderRequest(customer, product);
    }
}
