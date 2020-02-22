package com.kodilla.good.patterns.food2Door;

public class Application {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.processOrders(new OrderRequestRetriever().retrieve());

    }
}
