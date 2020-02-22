package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class HealthyShop implements FoodProducer {

    private Map<Product, Integer> productsList;

    public HealthyShop() {
        productsList = getProductsList();
    }

    private Map<Product, Integer> getProductsList() {
        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new HealthyShopProducts("Tomatoes 500g", 9.89, "vegetables"), 25);
        productsList.put(new HealthyShopProducts("Oranges 1kg", 7.49, "fruits"), 25);
        productsList.put(new HealthyShopProducts("Rice Milk 1litre", 8.99, "dairy"), 25);

        return productsList;
    }


    @Override
    public boolean process(Customer customer, Map<Product, Integer> productsOrders) {
        return (isOrdered(productsOrders));
    }
    public boolean isOrdered (Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) <= entry.getValue()) {
                System.out.println("Healthy Shop: We're sorry. Product is unavailable.");
                return false;
            }
        }
        return true;
    }
}
