package com.kodilla.patterns2.facade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private ProductService productService;
    private final List<Item> items = new ArrayList<>();
    private final Long orderID;
    private final Long userId;
    private boolean isPaid = false;
    private boolean isVerified = false;
    private boolean isSubmitted = false;

    public Order(ProductService productService, Long orderID, Long userId) {
        this.productService = productService;
        this.orderID = orderID;
        this.userId = userId;
    }

    public BigDecimal calculateValue() {
        BigDecimal sum = BigDecimal.ZERO;
        for(Item item: items) {
            sum = sum.add(productService.getPrice(item.getProductId())
                    .multiply(new BigDecimal(item.getQty())));

        }
        return sum;
    }

    public List<Item> getItems() {
        return items;
    }

    public Long getOrderID() {
        return orderID;
    }

    public Long getUserId() {
        return userId;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public boolean isSubmitted() {
        return isSubmitted;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public void setSubmitted(boolean submitted) {
        isSubmitted = submitted;
    }
}
