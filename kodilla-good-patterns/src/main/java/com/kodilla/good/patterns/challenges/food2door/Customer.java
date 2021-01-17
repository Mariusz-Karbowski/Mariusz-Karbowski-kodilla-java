package com.kodilla.good.patterns.challenges.food2door;

public class Customer {
    private String customerName;
    private String customerSurname;
    private String customerEmail;
    private String customerAddress;

    public Customer(String customerName, String customerSurname, String customerEmail, String customerAddress) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }
}
