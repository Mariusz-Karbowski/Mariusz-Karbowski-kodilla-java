package com.kodilla.good.patterns.challenges.aviationcompany;

import java.util.Objects;

public class Flight {
    private String departureCity;
    private String departureAirport;
    private String arrivalCity;
    private String arrivalAirport;

    public Flight(String departureCity, String departureAirport, String arrivalCity, String arrivalAirport) {
        this.departureCity = departureCity;
        this.departureAirport = departureAirport;
        this.arrivalCity = arrivalCity;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureCity, flight.departureCity)
                            && Objects.equals(departureAirport, flight.departureAirport)
                            && Objects.equals(arrivalCity, flight.arrivalCity)
                            && Objects.equals(arrivalAirport, flight.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureCity, departureAirport, arrivalCity, arrivalAirport);
    }
}
