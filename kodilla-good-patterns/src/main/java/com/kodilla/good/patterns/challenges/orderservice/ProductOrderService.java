package com.kodilla.good.patterns.challenges.orderservice;

import javax.management.Notification;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderDatabase orderDatabase;

    public ProductOrderService(InformationService informationService, OrderService orderService, OrderDatabase orderDatabase) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderDatabase = orderDatabase;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest);
        if (isOrdered) {
            informationService.notify(orderRequest.getCustomer());
            orderDatabase.createOrder(orderRequest);
            return new OrderDto(orderRequest.getCustomer(), true);
        } else return new OrderDto(orderRequest.getCustomer(), false);
    }
}
