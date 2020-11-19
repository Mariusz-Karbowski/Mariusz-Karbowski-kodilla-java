package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;


import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

class WeatherForecastTestSuite {

    private static int testCounter = 0;
    private Map<String, Double> mockupTemperaturesMap() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        return temperaturesMap;
    }

    @Mock
    private Temperatures temperaturesMock;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("All tests are done.");
    }
    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @AfterEach
    public void afterEveryTest() {
        System.out.println("Test #" + testCounter + " executed");
    }

    @DisplayName("Tests calculateForecast")
    @Test
    void testCalculateForecastWithMock() {
        //Given
        Map<String, Double> temperaturesMap = mockupTemperaturesMap();
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
    @DisplayName("Tests averageTemperature")
    @Test
    void testAverageTemperature() {
        //Given
        Map<String, Double> temperaturesMap = mockupTemperaturesMap();
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double avgTemp = weatherForecast.averageTemperature();
        //Then
        Assertions.assertEquals(25.56, avgTemp);
    }
    @DisplayName("Tests medianTemperature")
    @Test
    void testMedianTemperature() {
        //Given
        Map<String, Double> temperaturesMap = mockupTemperaturesMap();
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double medianTemp = weatherForecast.medianTemperature();
        //Then
        Assertions.assertEquals(25.5, medianTemp);
    }
}
