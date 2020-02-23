package com.kodilla.good.patterns.flightsFinder;

import java.time.LocalTime;
import java.util.ArrayList;

public final class FlightDatabase {


    private final ArrayList<Flight> flights = new ArrayList<Flight>();


    public FlightDatabase() {
        flights.add(new Flight("Berlin", "Tokyo", LocalTime.of(11, 20)));
        flights.add(new Flight("Paris", "Berlin", LocalTime.of(12, 15)));
        flights.add(new Flight("Warsaw", "Paris", LocalTime.of(12, 30)));
        flights.add(new Flight("Madrid", "Berlin", LocalTime.of(12, 50)));
        flights.add(new Flight("Berlin", "Warsaw", LocalTime.of(13, 10)));
        flights.add(new Flight("Paris", "Madrid", LocalTime.of(14, 20)));
        flights.add(new Flight("Porto", "Warsaw", LocalTime.of(15, 30)));
        flights.add(new Flight("Madrid", "Porto", LocalTime.of(16, 15)));
        flights.add(new Flight("Warsaw", "London", LocalTime.of(16, 50)));
    }

    public ArrayList<Flight> getFlight() {
        return new ArrayList<>(flights);
    }






}