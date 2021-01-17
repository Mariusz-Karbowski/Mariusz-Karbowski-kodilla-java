package com.kodilla.good.patterns.challenges.aviationcompany;

public class AppAC {

    public static void main(String[] args) {
        FlightChecker flightChecker = new FlightChecker();

        flightChecker.showDepartures("Warsaw");
        flightChecker.showArrivals("Warsaw");
        flightChecker.showStopoverFlights("Warsaw", "Paris");
    }
}
