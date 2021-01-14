package com.kodilla.good.patterns.challenges.orderservice;

public class Customer {
    private String username;
    private String name;
    private String surname;

    public Customer(String username, String name, String surname) {
        this.username = username;
        this.name = name;
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
