package com.kodilla.good.patterns.flightsFinder;

import java.util.ArrayList;

public final class FlightDatabase {
    private final ArrayList<Flight> flights = new ArrayList<>();

    public FlightDatabase() {

        flights.add(new Flight("Berlin", "Tokyo"));
        flights.add(new Flight("Paris", "Berlin"));
        flights.add(new Flight("Warsaw", "Paris"));
        flights.add(new Flight("Madrid", "Berlin"));
        flights.add(new Flight("Berlin", "Warsaw"));
        flights.add(new Flight("Paris", "Madrid"));
        flights.add(new Flight("Porto", "Warsaw"));
        flights.add(new Flight("Madrid", "Porto"));
        flights.add(new Flight("Warsaw", "London"));
        }

    public ArrayList<Flight> getFlight() {
        return new ArrayList<>(flights);
    }

}