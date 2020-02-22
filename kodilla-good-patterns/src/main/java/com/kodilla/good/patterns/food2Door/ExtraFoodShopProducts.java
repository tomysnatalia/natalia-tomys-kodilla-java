package com.kodilla.good.patterns.food2Door;

import java.util.Objects;

public class ExtraFoodShopProducts extends Product {
    private String companyName;

    public ExtraFoodShopProducts(String productName, double price, String companyName) {
        super(productName, price);
        this.companyName = companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExtraFoodShopProducts that = (ExtraFoodShopProducts) o;
        return Objects.equals(companyName, that.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName);
    }
}
