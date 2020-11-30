package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportsMap = new HashMap<>();
        airportsMap.put("Heathrow Airport", true);
        airportsMap.put("Charles de Gaulle Airport", false);
        airportsMap.put("Amsterdam Airport Schiphol", true);
        airportsMap.put("Gatwick Airport", true);
        airportsMap.put("London Stansted Airport", true);
        airportsMap.put("Geneva Airport", true);

        if (flight.getDepartureAirport() != null && airportsMap.get(flight.getDepartureAirport()) != false && airportsMap.get(flight.getArrivalAirport()) != false) {
            return airportsMap.get(flight.getDepartureAirport()) && airportsMap.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Some of the Airports are unavailable.");
        }
    }
}
