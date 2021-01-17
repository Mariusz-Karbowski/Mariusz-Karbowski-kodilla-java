package com.kodilla.good.patterns.challenges.aviationcompany;

import java.util.ArrayList;
import java.util.List;

public class FlightsDatabase {

    public List<Flight> getFlight() {
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Warsaw", "Chopin Airport","London", "Heathrow Airport"));
        flightList.add(new Flight("Warsaw", "Chopin Airport","London", "Stansted Airport"));
        flightList.add(new Flight("Warsaw", "Chopin Airport", "London", "Luton Airport"));
        flightList.add(new Flight("London", "Luton Airport","Modlin", "Mazovia Airport"));
        flightList.add(new Flight("London", "Stansted Airport", "Modlin", "Mazovia Airport"));
        flightList.add(new Flight("London", "Luton Airport", "Warsaw", "Chopin Airport"));
        flightList.add(new Flight("London", "Heathrow Airport", "Warsaw", "Chopin Airport"));
        flightList.add(new Flight("London", "Heathrow Airport", "Paris", "Orly Airport"));
        flightList.add(new Flight("London", "Heathrow Airport", "Paris","Charles de Gaulle Airport"));
        flightList.add(new Flight("London", "Luton Airport", "Paris", "Orly Airport"));
        flightList.add(new Flight("London", "Stansted Airport", "Paris", "Orly Airport"));
        return flightList;
    }
}
