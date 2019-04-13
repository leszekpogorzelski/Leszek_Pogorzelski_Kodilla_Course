package com.kodilla.good.patterns.food;

import java.util.HashMap;
import java.util.Map;

public class OrderRetriver {

    public Order retrive1() {
        Map<Integer, String> products = new HashMap<>();
        products.put(2, "Jabłka");
        products.put(5, "Gruszki");

        ProductsOrdered productsOrdered = new ProductsOrdered(products);

        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop", "ul. Kasztanowa 51",
                "Zamówienie zostało złożone w sklepie ExtraFood Shoop!", productsOrdered );

    return new Order(extraFoodShop);
    }
}
