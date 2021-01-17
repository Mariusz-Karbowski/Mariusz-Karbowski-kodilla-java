package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {

    private InformationService informationService;
    private CourierService courierService;
    private DistributionService distributionService;

    public OrderProcessor(InformationService informationService, CourierService courierService, DistributionService distributionService) {
        this.informationService = informationService;
        this.courierService = courierService;
        this.distributionService = distributionService;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = distributionService.process(orderRequest);
        if (isOrdered) {
            informationService.sendInformation(orderRequest);
            courierService.sendOrder(orderRequest);
            return new OrderDto(orderRequest, true);
        } else return new OrderDto(orderRequest, false);
    }


}