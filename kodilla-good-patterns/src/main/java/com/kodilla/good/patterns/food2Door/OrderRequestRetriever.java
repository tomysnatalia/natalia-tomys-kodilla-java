package com.kodilla.good.patterns.food2Door;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRequestRetriever {

    public List<OrderRequest> retrieve () {

        List<OrderRequest> orderRequestList = new ArrayList<>();

        Customer customer1 = new Customer ("Megan");
        LocalDate orderDate1 =  LocalDate.of(2020, Month.FEBRUARY,20);
        FoodProducer extraFoodShop = new ExtraFoodShop();
        Map<Product, Integer> productsList1 = new HashMap<>();
        productsList1.put(new ExtraFoodShopProducts("Truffle Oil", 15.99, "Monini"), 1);
        productsList1.put(new ExtraFoodShopProducts("Caviar", 59.99, "Marky's"), 1);
        productsList1.put(new ExtraFoodShopProducts("Brie", 9.99, "French Cheese"), 2);

        orderRequestList.add(new OrderRequest(customer1,orderDate1,extraFoodShop,productsList1));

        Customer customer2 = new Customer ("Alexis");
        LocalDate orderDate2 =  LocalDate.of(2020, Month.FEBRUARY,20);
        FoodProducer glutenFreeShop = new GlutenFreeShop();

        Map<Product, Integer> productsList2 = new HashMap<>();
        productsList2.put(new GlutenFreeShopProducts("Bread", 6.99, "rice flour"), 1);
        productsList2.put(new GlutenFreeShopProducts("Pasta Penne", 7.59, "buckwheat flour"), 2);
        productsList2.put(new GlutenFreeShopProducts("Cookies", 8.49, "coconut flour"),3);

        orderRequestList.add(new OrderRequest(customer2,orderDate2,glutenFreeShop,productsList2));

        Customer customer3 = new Customer ("Alex");
        LocalDate orderDate3 =  LocalDate.of(2020, Month.FEBRUARY,21);

        Map<Product, Integer> productsList3 = new HashMap<>();
        productsList3.put(new GlutenFreeShopProducts("Pasta Penne", 7.59, "buckwheat flour"), 2);
        productsList3.put(new GlutenFreeShopProducts("Cookies", 8.49, "coconut flour"),1);

        orderRequestList.add(new OrderRequest(customer3,orderDate3,glutenFreeShop,productsList3));

        Customer customer4 = new Customer ("Bob");
        LocalDate orderDate4 =  LocalDate.of(2020, Month.FEBRUARY,22);
        FoodProducer healthyShop = new HealthyShop();

        Map<Product, Integer> productsList4 = new HashMap<>();
        productsList4.put(new HealthyShopProducts("Tomatoes 500g", 9.89, "vegetables"), 25);
        productsList4.put(new HealthyShopProducts("Rice Milk 1litre", 8.99, "dairy"), 2);

        orderRequestList.add(new OrderRequest(customer4,orderDate4,healthyShop,productsList4));


        return orderRequestList;


    }
}
