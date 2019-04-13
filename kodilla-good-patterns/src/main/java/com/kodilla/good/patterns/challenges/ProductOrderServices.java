package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ProductOrderServices {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderServices(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.orderPlaced(orderRequest.getUser(), orderRequest.getProducts(),
                orderRequest.getLocalDate());

        if(isOrdered) {
            informationService.informUser (orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProducts(), orderRequest.getLocalDate());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
