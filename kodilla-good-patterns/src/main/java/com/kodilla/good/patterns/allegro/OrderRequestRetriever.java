package com.kodilla.good.patterns.allegro;

import java.time.LocalDate;
import java.time.Month;


public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User ("buyer5", "Antoni", "Kowalski");
        LocalDate orderDate = LocalDate.of(2020, Month.FEBRUARY, 15);
        Product product = new IphoneXR("Iphone XR", 2499.99);
        int quantity = 1;

        System.out.println("Date: " + orderDate + " User: " + user.getUserName()+ " ordered " + product.toString());

        return new OrderRequest(user, orderDate, product, quantity);

    }
}
