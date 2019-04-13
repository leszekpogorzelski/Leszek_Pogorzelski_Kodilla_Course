package com.kodilla.good.patterns.food;

import java.util.Map;

public class ExtraFoodShop implements FoodShop {

    private String companyName;
    private String address;
    private String orderProcess;
    private ProductsOrdered productsOrdered;

    public ExtraFoodShop(String companyName, String address, String orderProcess, ProductsOrdered productsOrdered) {
        this.companyName = companyName;
        this.address = address;
        this.orderProcess = orderProcess;
        this.productsOrdered = productsOrdered;
    }

    @Override
    public String getFoodSupplier() {
        String companyNameAndAddress = companyName + "\n" + address;
        return companyNameAndAddress;
    }

    @Override
    public Map<Integer, String> getProducts() {
        return productsOrdered.getProductsOrdered1();
    }

    @Override
    public String process() {
        return orderProcess;

    }
}
