package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String continentName;
    private List<Country> countriesList = new ArrayList<>();

    public Continent(final String continentName, List<Country> countriesList) {
        this.continentName = continentName;
        this.countriesList = countriesList;
    }

    public void addCountry(Country country) {
        countriesList.add(country);
    }

    public List<Country> getCountriesList() {
        return new ArrayList<>(countriesList);
    }
}
