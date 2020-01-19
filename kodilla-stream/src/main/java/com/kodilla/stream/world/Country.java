package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {

    private final String nameOfCountry;
    private final BigDecimal peopleQuantity;

    public Country(String nameOfCountry, BigDecimal peopleQuantity) {
        this.nameOfCountry = nameOfCountry;
        this.peopleQuantity = peopleQuantity;
    }


    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(nameOfCountry, country.nameOfCountry) &&
                Objects.equals(peopleQuantity, country.peopleQuantity);
    }

    @Override
    public int hashCode() {
        return nameOfCountry.hashCode();
    }
}
