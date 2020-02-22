package com.kodilla.good.patterns.food2Door;

public class InformationAboutOrders {

    public void sendMessageToCustomer (Customer customer) {
        System.out.println(customer.getCustomerName() + " Thank You for order. \nEnjoy your food :)! \n" );
    }
}
