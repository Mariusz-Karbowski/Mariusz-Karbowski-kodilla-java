package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {

    OrderRequest orderRequest;
    boolean isOrdered;

    public OrderDto(OrderRequest orderRequest, boolean isOrdered) {
        this.orderRequest = orderRequest;
        this.isOrdered = isOrdered;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}