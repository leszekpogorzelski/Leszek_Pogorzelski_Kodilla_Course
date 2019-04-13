package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductOrderMain {
    public static void main(String[] args){

        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrive();

        ProductOrderServices productOrderServices = new ProductOrderServices(new MessageService(), new OrderTakenOrderService(), new OrderTakenOrderRepository());
    productOrderServices.process(orderRequest);
    }
}
