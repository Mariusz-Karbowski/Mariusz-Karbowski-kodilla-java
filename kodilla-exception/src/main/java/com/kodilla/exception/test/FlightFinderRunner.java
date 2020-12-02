package com.kodilla.exception.test;

public class FlightFinderRunner {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        Flight flightNo1 = new Flight("London Stansted Airport", "Geneva Airport");
        Flight flightNo2 = new Flight("Gatwick Airport", "Amsterdam Airport Schiphol");
        Flight flightNo3 = new Flight("Heathrow Airport", "Warsaw Chopin Airport");

        try {
            System.out.println("Flight No1: " + flightFinder.findFlight(flightNo1) + "\nDeparture: "+ flightNo1.getDepartureAirport() + "\nArrival: " + flightNo1.getArrivalAirport() + "\n");
            System.out.println("Flight No2: " + flightFinder.findFlight(flightNo2) + "\nDeparture: "+ flightNo2.getDepartureAirport() + "\nArrival: " + flightNo2.getArrivalAirport() + "\n");
            System.out.println("Flight No3: " + flightFinder.findFlight(flightNo3) + "\nDeparture: "+ flightNo3.getDepartureAirport() + "\nArrival: " + flightNo3.getArrivalAirport() + "\n");
        } catch (RouteNotFoundException e) {
            System.out.println("Destination airport not available\n" + "(" + e + ")");
        } finally {
            System.out.println("\nThe end");
        }
    }
}