package com.kodilla.good.patterns.challenges.food2door;

public class Mail implements InformationService{
    @Override
    public void sendInformation(OrderRequest orderRequest) {
        System.out.println("Order notification send to: " + orderRequest.getCustomer().getCustomerName() +
                            " " +orderRequest.getCustomer().getCustomerSurname() + " (" + orderRequest.getCustomer().getCustomerEmail() + ")");
    }
}
