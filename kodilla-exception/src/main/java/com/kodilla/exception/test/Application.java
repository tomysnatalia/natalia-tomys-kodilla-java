package com.kodilla.exception.test;

public class Application {

    public static void main(String[] args) {

        Flight flight1 = new Flight("KTW", "WAW");
        Flight flight2 = new Flight("KTW", "ROMA");
        Flight flight3 = new Flight("KTW", "PARIS");
        Flight flight4 = new Flight("KTW", "LONDON");

        FlightFinder flightFinder = new FlightFinder();

        try { boolean findAirport1 = flightFinder.findAirport(flight1);
              System.out.println("Flight to Warsaw is available");
        } catch (RouteNotFoundException e) {
              System.out.println("can not find - incorrect airport name");

        }
    }
}
