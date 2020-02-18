package com.kodilla.good.patterns.allegro;


import java.time.LocalDate;

public class OrderRequest {

    private User user;
    private LocalDate orderDate;
    private Product product;
    private int quantity;

    public OrderRequest(User user, LocalDate orderDate, Product product, int quantity) {
        this.user = user;
        this.orderDate = orderDate;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
