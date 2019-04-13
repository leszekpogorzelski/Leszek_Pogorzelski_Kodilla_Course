package com.kodilla.good.patterns.food;

public class Order {
    private FoodShop foodShop;


    public Order(FoodShop foodShop){
        this.foodShop = foodShop;
    }

    public FoodShop getFoodShop() {
        return foodShop;
    }
}
