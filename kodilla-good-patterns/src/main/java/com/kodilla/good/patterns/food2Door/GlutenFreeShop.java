package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GlutenFreeShop implements FoodProducer {
    private ArrayList<Customer> registeredCustomer;
    private Map<Product, Integer> productsList;

    public GlutenFreeShop() {
        registeredCustomer = customersList();
        productsList = getProductsList();
    }

    private Map<Product, Integer> getProductsList() {
        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new GlutenFreeShopProducts("Bread", 6.99, "rice flour"), 25);
        productsList.put(new GlutenFreeShopProducts("Pasta Penne", 7.59, "buckwheat flour"), 55);
        productsList.put(new GlutenFreeShopProducts("Cookies", 8.49, "coconut flour"), 31);

        return productsList;
    }

    private ArrayList<Customer> customersList() {
        ArrayList<Customer> registeredCustomer = new ArrayList<>();
        registeredCustomer.add(new Customer("Alex"));
        return registeredCustomer;

    }

    @Override

    public boolean process(Customer customer, Map<Product, Integer> productsOrders) {
        if (!registeredCustomer.contains(customer) && isOrdered(productsOrders)) {
            System.out.println("Sorry before we will processing your order You need to register to our website");
            return false;
        }
        return true;
    }

    public boolean isOrdered (Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) <= entry.getValue()) {
                System.out.println("Gluten Free Shop: We're sorry. Product is unavailable.");
                return false;
            }
        }
        return true;
    }
}

