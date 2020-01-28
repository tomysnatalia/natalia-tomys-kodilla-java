package com.kodilla.exception.test;
import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    private Map<String, Boolean> airports;


    public FlightFinder() {
        airports = airports();
    }

    private Map<String, Boolean> airports() {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("WAW", true);
        airports.put("ROMA", true);
        airports.put("LONDON", true);
        airports.put("PARIS", true);

        return airports;
    }


    boolean findAirport(Flight arrivalAirport) throws RouteNotFoundException {
        if (airports.containsKey(arrivalAirport)) {
            return airports.get(arrivalAirport);
        } else {
            throw new RouteNotFoundException("Airport does not exist!");
        }
    }
}


