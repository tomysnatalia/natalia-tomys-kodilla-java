package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.BasicTaxiOrder;
import com.kodilla.patterns2.decorator.taxiportal.TaxiNetworkOrderDecorator;
import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaGetCost() {

        //Given
        PizzaOrder theOrder = new BasicPizza();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15.00), calculatedCost);

    }

    @Test
    public void testBasicPizzaGetDescription() {

        //Given
        PizzaOrder theOrder = new BasicPizza();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Ingredients: tomatoes sauce + cheese", description);
    }

    @Test
    public void testExtraOlivesPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new ExtraOlives(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(18.00), calculatedCost);
    }

    @Test
    public void testExtraOlivesPizzaGetDescription() {

        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new ExtraOlives(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Ingredients: tomatoes sauce + cheese + olives", description);
    }

    @Test
    public void testParmaPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new ExtraParmaHam(theOrder);
        theOrder = new ExtraRucola(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(26.50), calculatedCost);
    }

    @Test
    public void testParmaPizzaGetDescription() {

        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new ExtraParmaHam(theOrder);
        theOrder = new ExtraRucola(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Ingredients: tomatoes sauce + cheese + parma ham + rucola", description);
    }

    @Test
    public void testQuattroStagioniPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new ExtraArtichokes(theOrder);
        theOrder = new ExtraOlives(theOrder);
        theOrder = new ExtraPeperoni(theOrder);
        theOrder = new ExtraMushrooms(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(30.00), calculatedCost);
    }

    @Test
    public void testQuattroStagioniPizzaGetDescription() {

        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new ExtraArtichokes(theOrder);
        theOrder = new ExtraOlives(theOrder);
        theOrder = new ExtraPeperoni(theOrder);
        theOrder = new ExtraMushrooms(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Ingredients: tomatoes sauce + cheese + artichokes + olives + peperoni + mushrooms", description);
    }


}