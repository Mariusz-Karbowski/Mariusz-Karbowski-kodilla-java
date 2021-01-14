package com.kodilla.good.patterns.challenges.orderservice;

public class Database implements OrderDatabase {
    @Override
    public void createOrder(OrderRequest orderRequest) {
        System.out.println("Order saved: " + orderRequest.getProduct().getNameOfProduct() + ", " + orderRequest.getProduct().getQuantityOfProduct()
                            + " pcs, " + orderRequest.getProduct().getPrice() + " PLN By: " + orderRequest.getCustomer().getName()
                            + orderRequest.getCustomer().getSurname() + " (" + orderRequest.getCustomer().getUsername() + ")" + " Order date: " + orderRequest.getOrderDate());;
    }
}
