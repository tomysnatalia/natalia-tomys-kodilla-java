package com.kodilla.good.patterns.flightsFinder;


import java.util.ArrayList;
import java.util.stream.Collectors;

public class FlightFinder {


    public static void main(String[] args) {

        FlightDatabase flightdatabase = new FlightDatabase();

        ArrayList<Flight> arrivalCity = (ArrayList<Flight>) flightdatabase.getFlight().stream()
                .filter(flight -> flight.getArrival().equals("Warsaw"))
                .collect(Collectors.toList());
        arrivalCity.stream()
                .forEach(System.out::println);
        System.out.println();

        ArrayList<Flight> departureCity = (ArrayList<Flight>) flightdatabase.getFlight().stream()
                .filter(flight -> flight.getDeparture().equals("Berlin"))
                .collect(Collectors.toList());
        departureCity.stream()
                .forEach(System.out::println);

        }
    }



