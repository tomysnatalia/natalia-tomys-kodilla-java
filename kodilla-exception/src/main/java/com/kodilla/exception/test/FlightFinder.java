package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {


   public boolean findFlight (Flight flight) throws RouteNotFoundException {
       return findAirport(flight.getArrivalAirport());
   }

   private boolean findAirport (String airportName) throws RouteNotFoundException {
       if (airportsMap().containsKey(airportName)) {
           return airportsMap().get(airportName);
       } else {
           throw new RouteNotFoundException( "Airport does not exist!");
       }
   }


   private Map<String, Boolean> airportsMap () {
       Map<String, Boolean> arrivalAirports = new HashMap<>();
       arrivalAirports.put("LONDON", true);
       arrivalAirports.put("ROMA", true);
       arrivalAirports.put("BERLIN", true);

       return arrivalAirports;

   }
}

