package com.kodilla.good.patterns.food2Door;

import java.util.Objects;

public class GlutenFreeShopProducts extends Product{
    private String productDescription;

    public GlutenFreeShopProducts(String productName, double price, String productDescription) {
        super(productName, price);
        this.productDescription = productDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GlutenFreeShopProducts that = (GlutenFreeShopProducts) o;
        return Objects.equals(productDescription, that.productDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productDescription);
    }
}
