package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperature() {

        double average;
        double sum = 0;
        int counter = 0;
        for (Map.Entry<String, Double> averageTemperature : temperatures.getTemperatures().entrySet()) {
            sum += averageTemperature.getValue();
            counter ++;
        }
        average = sum / counter;
        return average;
    }

    public double medianTemperature() {

        List<Double> temperaturesList = new ArrayList<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            boolean higherTemperature = false;
            int counter = 0;
            while (!higherTemperature) {
                if (temperaturesList.isEmpty() == true) {
                    temperaturesList.add(counter, temperature.getValue());
                    higherTemperature = true;
                } else  if (counter == temperaturesList.size()) {
                    temperaturesList.add(temperature.getValue());
                    higherTemperature = true;
                } else if (temperature.getValue() <= temperaturesList.get(counter)) {
                    temperaturesList.add(counter, temperature.getValue());
                    higherTemperature = true;
                } else {
                    counter++;
                }
            }
        }
        double median;
        int numberOfElement;
        if (temperaturesList.size() % 2 == 0) {
            numberOfElement = temperaturesList.size() / 2;
            median = (temperaturesList.get(numberOfElement) + temperaturesList.get(numberOfElement - 1)) / 2;
        } else {
            numberOfElement = ((temperaturesList.size() / 2));
            median = temperaturesList.get(numberOfElement);
        }
        return median;
    }
}
