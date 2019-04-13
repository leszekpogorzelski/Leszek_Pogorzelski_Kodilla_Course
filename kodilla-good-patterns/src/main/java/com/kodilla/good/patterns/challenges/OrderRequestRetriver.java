package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriver {

    public OrderRequest retrive(){
        List<String> productsOrdered = new ArrayList();
        productsOrdered.add("Rower");
        productsOrdered.add("Latarka");
        productsOrdered.add("Szklanka");

        User user = new User("Jan", "Kowalski");
        Products products = new Products(productsOrdered);

        LocalDate dateOfOrder = LocalDate.now();

        return new OrderRequest(user, products, dateOfOrder);
    }
}
