package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraArtichokes extends AbstractPizzaOrderDecorator {

    public ExtraArtichokes (PizzaOrder pizzaOrder) {
        super (pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + artichokes";
    }
}

