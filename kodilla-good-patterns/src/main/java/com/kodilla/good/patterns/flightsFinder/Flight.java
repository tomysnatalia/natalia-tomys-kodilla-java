package com.kodilla.good.patterns.flightsFinder;

import java.util.Objects;

public final class Flight {
    private final String departure;
    private final String arrival;


    public Flight(final String departure, final String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String toString() {
        return "Flight from " + this.departure + " to " + this.arrival;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departure, flight.departure) &&
                Objects.equals(arrival, flight.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival);
    }


}
