package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements DistributionService {
    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("Order with Food2Door at GLUTEN FREE SHOP successful.");
        return true;
    }
}
