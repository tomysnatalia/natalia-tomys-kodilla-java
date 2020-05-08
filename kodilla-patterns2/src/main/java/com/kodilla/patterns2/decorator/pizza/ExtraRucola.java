package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraRucola extends AbstractPizzaOrderDecorator {

    public ExtraRucola (PizzaOrder pizzaOrder) {
        super (pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3.50));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + rucola";
    }
}

