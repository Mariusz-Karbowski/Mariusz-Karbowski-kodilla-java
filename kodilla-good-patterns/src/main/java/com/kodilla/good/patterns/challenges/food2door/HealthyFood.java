package com.kodilla.good.patterns.challenges.food2door;

public class HealthyFood implements DistributionService {
    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("Order with Food2Door at HEALTHY FOOD successful.");
        return true;
    }
}