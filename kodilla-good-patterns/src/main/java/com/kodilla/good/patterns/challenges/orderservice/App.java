package com.kodilla.good.patterns.challenges.orderservice;

public class App {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new Mail(), new Order(), new Database());
        productOrderService.process(orderRequest);
    }
}
