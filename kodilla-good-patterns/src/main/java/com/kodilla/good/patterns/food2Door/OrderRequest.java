package com.kodilla.good.patterns.food2Door;

import java.time.LocalDate;
import java.util.Map;

public class OrderRequest {


    private Customer customer;
    private LocalDate orderDate;
    private FoodProducer foodProducer;
    private Map<Product, Integer> productsOrdersRequest;

    public OrderRequest(Customer customer, LocalDate orderDate, FoodProducer foodProducer, Map<Product, Integer> productsOrdersRequest) {
        this.customer = customer;
        this.orderDate = orderDate;
        this.foodProducer = foodProducer;
        this.productsOrdersRequest = productsOrdersRequest;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public FoodProducer getFoodProducer() {
        return foodProducer;
    }

    public Map<Product, Integer> getProductsOrdersRequest() {
        return productsOrdersRequest;
    }
}
