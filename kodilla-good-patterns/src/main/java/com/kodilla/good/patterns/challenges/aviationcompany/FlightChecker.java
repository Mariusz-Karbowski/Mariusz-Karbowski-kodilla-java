package com.kodilla.good.patterns.challenges.aviationcompany;

import java.util.ArrayList;
import java.util.List;

public class FlightChecker {
    private FlightsDatabase listOfFlights = new FlightsDatabase();

    public void showDepartures(String departure) {
        System.out.println("\nFlights from " + departure + ":");
        listOfFlights.getFlight().stream()
                .filter(flight -> flight.getDepartureCity().equals(departure))
                .forEach(p -> System.out.println("ARRIVAL: " + p.getArrivalCity() + " " + p.getArrivalAirport()));
    }

    public void showArrivals(String arrival) {
        System.out.println("\nFlights to " + arrival + ":");
        listOfFlights.getFlight().stream()
                .filter(flight -> flight.getArrivalCity().equals(arrival))
                .forEach(p -> System.out.println("DEPARTURE: " + p.getDepartureCity() + " " + p.getDepartureAirport()));
        System.out.println();
    }

    public void showStopoverFlights(String departure, String arrival) {
        List<Flight> stopoverFlights = new ArrayList<>();
        System.out.println("\nFlights from " + departure + " to " + arrival + " with stopover:");
        listOfFlights.getFlight().stream()
                .filter(flight -> flight.getArrivalCity().equals(arrival))
                .forEach(l -> stopoverFlights.add(l));

        listOfFlights.getFlight().stream()
                .filter(flight -> flight.getDepartureCity().equals(departure))
                .forEach(l -> stopoverFlights.add(l));

        stopoverFlights.stream()
                .filter(flight -> !flight.getDepartureCity().equals(departure))
                .forEach(flight -> System.out.println("DEPARTURE: " + departure + " STOPOVER: " + flight.getDepartureCity() + " " + flight.getDepartureAirport() + " ARRIVAL: " + arrival + " " + flight.getArrivalAirport()));
    }
}
