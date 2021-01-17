package com.kodilla.good.patterns.challenges.food2door;

public class Courier implements CourierService{

    @Override
    public void sendOrder(OrderRequest orderRequest) {
        System.out.println("Delivery to: " + orderRequest.getCustomer().getCustomerName() + " " + orderRequest.getCustomer().getCustomerSurname()
                            + " " + orderRequest.getCustomer().getCustomerAddress());
    }
}
