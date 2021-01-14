package com.kodilla.good.patterns.challenges.orderservice;

public class Mail implements InformationService {

    @Override
    public void notify(Customer customer) {
        System.out.println("Notification email sent to: " + customer.getName() + " " + customer.getSurname() + " (" + customer.getUsername() + ")");
    }
}
