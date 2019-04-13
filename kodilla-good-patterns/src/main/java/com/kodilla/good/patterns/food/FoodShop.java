package com.kodilla.good.patterns.food;

import java.util.Map;

public interface FoodShop {

    String getFoodSupplier();

    Map<Integer, String> getProducts();

    String process();
}
