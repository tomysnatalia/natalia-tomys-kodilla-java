package com.kodilla.good.patterns.flightsFinder;

public class FinderApplication {

    public static void main (String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        flightFinder.departureCity("Berlin");
        flightFinder.arrivalCity("London");
        flightFinder.availableConnectingFlights("Warsaw","Madrid");

    }
}


