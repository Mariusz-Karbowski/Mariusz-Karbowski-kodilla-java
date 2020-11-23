package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private List<Continent> continentsList = new ArrayList<>();

    public World(List<Continent> countriesList) {
        this.continentsList = countriesList;
    }

    public void addContinent(Continent continent) {
        continentsList.add(continent);
    }

    public List<Continent> getContinentsList() {
        return new ArrayList<>(continentsList);
    }

    public BigDecimal getPeopleQuantity() {
        return continentsList.stream()
                .flatMap(continent -> continent.getCountriesList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
