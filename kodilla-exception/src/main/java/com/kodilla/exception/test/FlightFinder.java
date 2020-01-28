package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> arrivalAirports = new HashMap<>();
        arrivalAirports.put("LONDON", true);
        arrivalAirports.put("ROMA", true);
        arrivalAirports.put("BERLIN", true);
        arrivalAirports.put("Kiev", false);

        return arrivalAirports;
    }
}
