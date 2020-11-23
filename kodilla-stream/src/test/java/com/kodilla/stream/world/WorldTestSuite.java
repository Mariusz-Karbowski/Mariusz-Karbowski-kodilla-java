package com.kodilla.stream.world;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Test of method counting world population.");
    }
    @AfterAll
    public static void afterAllTests() {
        System.out.println("Test finished.");
    }

    @Test
    public void testGetPeopleQuantity() {
        //Given
        //Europe
        Continent europe = new Continent("Europe", new ArrayList<>());
        europe.addCountry(new Country("Poland", new BigDecimal("38539869")));
        europe.addCountry(new Country("Italy", new BigDecimal("58133509")));
        europe.addCountry(new Country("Germany", new BigDecimal("82422299")));
        europe.addCountry(new Country("France", new BigDecimal("62752136")));
        //Asia
        Continent asia = new Continent("Asia", new ArrayList<>());
        asia.addCountry(new Country("China", new BigDecimal("1314480000")));
        asia.addCountry(new Country("India", new BigDecimal("1095351995")));
        asia.addCountry(new Country("Japan", new BigDecimal("127463611")));

        World world = new World(new ArrayList<>());
        world.addContinent(europe);
        world.addContinent(asia);

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Then
        assertEquals(new BigDecimal("2779143419"), peopleQuantity);
        System.out.println("Current count: " + peopleQuantity + "people");

    }
}
