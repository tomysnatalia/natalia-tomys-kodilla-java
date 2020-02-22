package com.kodilla.good.patterns.food2Door;

import java.util.List;

public class OrderService {

    public void processOrders(List<OrderRequest> orderRequest) {

        orderRequest.stream()
                .map(n -> {
                    System.out.println("Hi!\n"+ n.getCustomer().getCustomerName() + " we're processing your order " + "from: " + n.getOrderDate());
                    return n.getFoodProducer().process(n.getCustomer(), n.getProductsOrdersRequest());
                })
                .forEach(o -> System.out.println("The order has been sent: " + o));
    }
}