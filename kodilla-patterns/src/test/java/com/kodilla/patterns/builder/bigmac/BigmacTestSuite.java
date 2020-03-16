package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew () {
        //Given
        Bigmac sandwich = new Bigmac.BigmacBuilder()
                .burgers(1)
                .bun(Bun.withSezame)
                .ingredient(Ingredients.cheese)
                .ingredient(Ingredients.lettuce)
                .sauce(Sauce.standard)
                .build();
        System.out.println(sandwich);
        //When
        int howManyIngredients = sandwich.getIngredients().size();
        int howManyBurgers = sandwich.getBurgers();
        //Then
        Assert.assertEquals(2, howManyIngredients);
        Assert.assertTrue(sandwich.getIngredients().contains(Ingredients.cheese));
        Assert.assertTrue(sandwich.getIngredients().contains(Ingredients.lettuce));
        Assert.assertEquals(1, howManyBurgers);

    }
}
