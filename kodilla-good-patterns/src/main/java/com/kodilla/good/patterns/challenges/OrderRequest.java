package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequest {

    private User user;
    private Products products;
    private LocalDate localDate;

    public OrderRequest(User user, Products products, LocalDate localDate) {
        this.user = user;
        this.products = products;
        this.localDate = localDate;
    }

    public User getUser() {
        return user;
    }

    public Products getProducts() {
        return products;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
}
