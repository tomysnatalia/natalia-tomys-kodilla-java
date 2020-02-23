package com.kodilla.good.patterns.flightsFinder;

import java.util.*;
import java.util.stream.Collectors;

public class FlightFinder {

    FlightDatabase flightDatabase = new FlightDatabase();

    public void departureCity(String departure) {
        ArrayList<Flight> departureCity = (ArrayList<Flight>) flightDatabase.getFlight().stream()
                .filter(flight -> flight.getDeparture().equals(departure))
                .collect(Collectors.toList());
        departureCity.stream()
                .forEach(System.out::println);
        System.out.println();
    }


    public void arrivalCity(String arrival) {
        ArrayList<Flight> arrivalCity =(ArrayList<Flight>) flightDatabase.getFlight().stream()
                .filter(flight -> flight.getArrival().equals(arrival))
                .collect(Collectors.toList());
        arrivalCity.stream()
                .forEach(System.out::println);
        System.out.println();
    }

    public void availableConnectingFlights(String departure, String arrival) {
        flightDatabase.getFlight().stream()
                .filter(flight -> flight.getDeparture().equals(departure))
                .forEach(flight -> {
                    List<Flight> flightChange = flightDatabase.getFlight().stream()
                            .filter(flight2 -> (flight.getArrival().equals(flight2.getDeparture()) && flight2.getArrival().equals(arrival)))
                            .collect(Collectors.toList());

                    if (flightChange.size() > 0) {
                        ArrayList<Flight> connectingFlights = new ArrayList<>();
                        connectingFlights.add(flight);
                        connectingFlights.addAll(flightChange);
                        connectingFlights.stream()
                                .forEach(System.out::println);
                        System.out.println();

                    }
                });
    }
}