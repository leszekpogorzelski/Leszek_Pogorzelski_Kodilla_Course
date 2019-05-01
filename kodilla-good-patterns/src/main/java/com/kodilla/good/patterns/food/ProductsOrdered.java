package com.kodilla.good.patterns.food;

import java.util.HashMap;
import java.util.Map;

public class ProductsOrdered {

    private final Map<Integer, String> productOrder;


    public ProductsOrdered(final Map<Integer, String> map){
        this.productOrder = map;
    }

    public final Map<Integer, String> getProductsOrdered1() {
        return new HashMap<>(productOrder);
    }



}
