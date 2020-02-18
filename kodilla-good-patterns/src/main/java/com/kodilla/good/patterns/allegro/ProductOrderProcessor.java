package com.kodilla.good.patterns.allegro;

public class ProductOrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDTO process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.ordered(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity(), orderRequest.getOrderDate());
            if (isOrdered) {
                informationService.sendMessage(orderRequest.getUser());
                orderRepository.sendOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity(), orderRequest.getOrderDate());
                return new OrderDTO(orderRequest.getUser(), orderRequest.getOrderDate(), orderRequest.getProduct(),orderRequest.getQuantity(), true);
            } else {
                return new OrderDTO(orderRequest.getUser(), orderRequest.getOrderDate(), orderRequest.getProduct(),orderRequest.getQuantity(),false);
            }
        }
    }
