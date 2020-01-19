package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continentsOnTheWorld = new ArrayList<>();

    public void addContinent(Continent continent) {
        continentsOnTheWorld.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
       BigDecimal peopleQuantityOnTheWorld = continentsOnTheWorld.stream()
               .flatMap(continent -> continent.getCountryList().stream())
               .map(Country::getPeopleQuantity)
               .reduce(BigDecimal.ZERO, (sum, country) -> sum.add(country));
               return peopleQuantityOnTheWorld;
    }

}
