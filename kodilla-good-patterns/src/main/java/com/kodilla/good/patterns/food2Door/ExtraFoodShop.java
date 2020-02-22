package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExtraFoodShop implements FoodProducer {


    private Map<Product, Integer> productsList;

    public ExtraFoodShop() {
        productsList = getProductsList();
    }

    private Map<Product, Integer> getProductsList() {
        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new ExtraFoodShopProducts("Truffle Oil", 15.99, "Monini"), 15);
        productsList.put(new ExtraFoodShopProducts("Caviar", 59.99, "Marky's"), 2);
        productsList.put(new ExtraFoodShopProducts("Brie", 9.99, "French Cheese"), 6);

        return productsList;

    }

    public void voucherForCustomers (Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            double sum = (entry.getValue() * GlutenFreeShopProducts.getPrice()) * productsList.size();
            double sum1 = 50 - sum;
            if (sum >= 50) {
                System.out.println("You order over 50 euro, we have a voucher for 10% off for your next order!");
            } else {
                System.out.println("You need order for "+ sum1 + " to get our voucher");
            }
        }
    }


    @Override

    public boolean process(Customer customer, Map<Product, Integer> productsOrders) {
        return (isOrdered(productsOrders));
    }
    public boolean isOrdered (Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) <= entry.getValue()) {
                System.out.println("Extra Food Shop: We're sorry. Product is unavailable.");
                return false;
            }
        }
        return true;
    }
}


