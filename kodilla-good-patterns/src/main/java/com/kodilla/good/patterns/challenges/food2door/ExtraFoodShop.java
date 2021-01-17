package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements DistributionService {
    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("Order with Food2Door at EXTRA FOOD SHOP successful.");
        return true;
    }
}
