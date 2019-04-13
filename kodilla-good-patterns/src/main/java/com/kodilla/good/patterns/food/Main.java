package com.kodilla.good.patterns.food;

public class Main {

    public static void main(String[] srgs) {

        OrderRetriver orderRetriver = new OrderRetriver();
        Order order = orderRetriver.retrive1();
        System.out.println(order.getFoodShop().getFoodSupplier());
        System.out.println(order.getFoodShop().getProducts().entrySet());

        OrderProcessor orderProcessor = new OrderProcessor(order);
        if(orderProcessor.orderProcessed()) {
            System.out.println("\nZlecenie przyjęte do relizacji");
        } else {
            System.out.println("Awaria systemu!");
        }


    }
}
