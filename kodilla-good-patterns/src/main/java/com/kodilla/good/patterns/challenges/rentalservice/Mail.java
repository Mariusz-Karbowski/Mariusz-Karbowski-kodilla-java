package com.kodilla.good.patterns.challenges.rentalservice;

public class Mail implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Notification email sent to: " + user.getName() + " " + user.getSurname() + "(" + user.getEmail() + ")");
    }

}
