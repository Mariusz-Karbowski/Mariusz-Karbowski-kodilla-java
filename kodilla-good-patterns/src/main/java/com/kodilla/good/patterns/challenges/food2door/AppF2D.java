package com.kodilla.good.patterns.challenges.food2door;

public class AppF2D {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retriever();
        OrderProcessor orderImplementation = new OrderProcessor(new Mail(), new Courier(), new HealthyFood());
        orderImplementation.process(orderRequest);
    }

}
