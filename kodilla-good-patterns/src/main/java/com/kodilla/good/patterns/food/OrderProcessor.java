package com.kodilla.good.patterns.food;

public class OrderProcessor {

    private Order order;


    public OrderProcessor(Order order) {
        this.order = order;

    }

    public boolean orderProcessed() {

        System.out.println(order.getFoodShop().process());
        return true;



    }
}
