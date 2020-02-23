package com.kodilla.good.patterns.flightsFinder;

import java.time.LocalTime;
import java.util.Objects;

public final class Flight {
    private final String departure;
    private final String arrival;
    private final LocalTime timeDeparture;


    public Flight(final String departure, final String arrival, final LocalTime timeDeparture ) {
        this.departure = departure;
        this.arrival = arrival;
        this.timeDeparture = timeDeparture;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public LocalTime getTimeDeparture() {
        return timeDeparture;
    }

    public String toString(){
        return "Flight from " + this.departure + " to " + this.arrival + " departure time: " + timeDeparture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departure, flight.departure) &&
                Objects.equals(arrival, flight.arrival) &&
                Objects.equals(timeDeparture, flight.timeDeparture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival, timeDeparture);
    }
}
