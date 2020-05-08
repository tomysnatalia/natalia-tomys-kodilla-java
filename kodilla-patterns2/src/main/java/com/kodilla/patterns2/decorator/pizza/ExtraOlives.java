package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraOlives extends AbstractPizzaOrderDecorator {

    public ExtraOlives (PizzaOrder pizzaOrder) {
        super (pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + olives";
    }
}

