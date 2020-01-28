package com.kodilla.exception.test;

import java.util.Map;

public class App {

    public static void main (String [] args) {
        Flight flight1 = new Flight("WAW", "LONDON");
        Flight flight2 = new Flight("WAW", "ROMA");
        Flight flight3 = new Flight("WAW", "BERLIN");

        FlightFinder flightFinder = new FlightFinder();

        try {
            Map<String, Boolean> isFlightToL = flightFinder.findFlight(flight1);
            System.out.println("Flight to London is available from this airport " + isFlightToL);
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }

        try {
            Map<String, Boolean> isFlightToR = flightFinder.findFlight(flight2);
            System.out.println("Flight to Roma is available from this airport" + isFlightToR);
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }

        try {
            Map<String, Boolean> isFlightToB = flightFinder.findFlight(flight3);
            System.out.println("Flight to Berlin is available from this airport" + isFlightToB);
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }
    }
}
