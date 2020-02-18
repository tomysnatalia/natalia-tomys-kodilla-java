package com.kodilla.good.patterns.allegro;

public class Application {
    public static void main (String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderProcessor processor = new ProductOrderProcessor(new InformationService(), new OrderService(), new OrderRepository());
        processor.process(orderRequest);

    }
}
