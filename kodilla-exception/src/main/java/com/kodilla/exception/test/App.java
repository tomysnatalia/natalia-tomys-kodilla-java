package com.kodilla.exception.test;

import java.util.Map;

public class App {

    public static void main (String [] args) {
        Flight flight1 = new Flight("WAW", "LONDON");
        Flight flight2 = new Flight("WAW", "ROMA");
        Flight flight3 = new Flight("WAW", "BERLIN");

        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight1);
            System.out.println("Flight to London is available from this airport " );
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }

        try {
            flightFinder.findFlight(flight2);
            System.out.println("Flight to Roma is available from this airport" );
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }

        try {
           flightFinder.findFlight(flight3);
            System.out.println("Flight to Berlin is available from this airport");
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }
    }
}
