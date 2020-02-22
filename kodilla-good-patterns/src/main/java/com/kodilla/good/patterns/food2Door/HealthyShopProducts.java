package com.kodilla.good.patterns.food2Door;

public class HealthyShopProducts extends Product {
    private String typeOfProduct;

    public HealthyShopProducts(String productName, double price, String typeOfProduct) {
        super(productName, price);
        this.typeOfProduct = typeOfProduct;
    }
}
