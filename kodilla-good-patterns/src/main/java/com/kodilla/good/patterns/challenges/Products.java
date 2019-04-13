package com.kodilla.good.patterns.challenges;

import java.util.List;

public class Products {
    private List<String> productsOrder;

    public Products(List <String> productsOrdered){
        this.productsOrder = productsOrdered;
    }

    public List<String> getProductsOrderd() {
        return productsOrder;
    }
}
