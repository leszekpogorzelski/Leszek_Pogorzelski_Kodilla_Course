package com.kodilla.good.patterns.challenges;

public class OrderDto {

    public User user;
    public boolean orderTaken;

    public OrderDto(User user, boolean orderTaken){
        this.user = user;
        this.orderTaken = orderTaken;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrderTaken() {
        return orderTaken;
    }
}
