package com.kodilla.good.patterns.challenges.orderservice;

public class Order implements OrderService {

    @Override
    public boolean order(OrderRequest orderRequest) {
        System.out.println("Order: " + orderRequest.getProduct().getNameOfProduct() + ", " + orderRequest.getProduct().getQuantityOfProduct()
                            + " pcs, " + orderRequest.getProduct().getPrice() + " PLN By: " + orderRequest.getCustomer().getName()
                            + " " + orderRequest.getCustomer().getSurname() + " (" + orderRequest.getCustomer().getUsername() + ")" + " Order date: " + orderRequest.getOrderDate());
        return true;
    }
}
