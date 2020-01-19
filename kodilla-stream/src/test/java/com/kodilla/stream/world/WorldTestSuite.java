package com.kodilla.stream.world;

import com.kodilla.stream.sand.Europe;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent americaNorth  = new Continent("America North");

        Country poland = new Country("Poland", new BigDecimal("150000000"));
        Country japan = new Country("Japan", new BigDecimal("500000"));
        Country usa = new Country("USA", new BigDecimal("550000000"));

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(americaNorth);

        europe.addCountry(poland);
        asia.addCountry(japan);
        americaNorth.addCountry(usa);

        //When
        BigDecimal allPeople = world.getPeopleQuantity();

        //Then
        BigDecimal resultAllPeople = new BigDecimal("700500000");
        Assert.assertEquals(resultAllPeople,allPeople);





    }

}
