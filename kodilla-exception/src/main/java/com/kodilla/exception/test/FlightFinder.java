package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {


   public boolean findFlight (Flight flight) throws RouteNotFoundException {
       if (airportsMap() == flight) {
           return airportsMap().get(flight);
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

