package com.kodilla.good.patterns.food2Door;

public class Product {

    private String productName;
    public static double price;


    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;

    }

    public String getProductName() {
        return productName;
    }

    public static double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product: " + "productName: " + productName + "price: " + price;
    }
}
