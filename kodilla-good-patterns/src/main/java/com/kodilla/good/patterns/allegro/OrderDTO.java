package com.kodilla.good.patterns.allegro;

import java.time.LocalDate;

public class OrderDTO {
    private User user;
    private LocalDate orderDate;
    private Product product;
    private int quantity;
    private boolean sold;

    public OrderDTO (final User user, final LocalDate orderDate, final Product product, final int quantity, final boolean sold) {
        this.user = user;
        this.orderDate = orderDate;
        this.product = product;
        this.quantity = quantity;
        this.sold = sold;
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

    public boolean isSold() {
        return sold;
    }
}
