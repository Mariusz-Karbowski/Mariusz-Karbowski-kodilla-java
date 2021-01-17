package com.kodilla.good.patterns.challenges.rentalservice;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository{

    @Override
    public boolean createRental(final User user, final LocalDateTime carRentFrom, final LocalDateTime carRentTo) {
        System.out.println("Repository: " + user.getName() + " " + user.getSurname() + "(" + user.getEmail() + ")"
                + " from: " + carRentFrom.toString() + " to: " + carRentTo.toString());

        return true;
    }

}