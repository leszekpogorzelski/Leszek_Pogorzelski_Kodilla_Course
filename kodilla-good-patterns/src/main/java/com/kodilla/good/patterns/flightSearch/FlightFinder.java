package com.kodilla.good.patterns.flightSearch;

import java.util.*;
import java.util.stream.Collectors;

public final class FlightFinder  {
    private static Map<Flight, Boolean> flightDestinations = new HashMap<>();

    public FlightFinder(Map<Flight, Boolean> flightDestinations){
        this.flightDestinations = flightDestinations;
    }

    public void findAllFlightsFrom(String from) /*throws RouteNotFoundException*/ {
        flightDestinations.entrySet().stream()
                .map(Map.Entry::getKey)
                .filter(f -> f.getDepartureAirport().equals(from))
                .forEach(System.out::println);
    }

    public void findAllFlightsTo(String to) /*throws RouteNotFoundException*/ {
        flightDestinations.entrySet().stream()
                .map(Map.Entry::getKey)
                .filter(f -> f.getArrivalAirport().equals(to))
                .forEach(System.out::println);
    }

    public void findIndirectFlightsFromTo(String from, String to) {
        List<String> search = new LinkedList<>();

        flightDestinations.entrySet().stream()
                .map(Map.Entry::getKey)
                .filter(f -> f.getDepartureAirport().equals(from))
                .map(s -> s.getArrivalAirport())
                .forEach(search::add);

       flightDestinations.entrySet().stream()
                .map(Map.Entry::getKey)
                .filter(f -> f.getArrivalAirport().equals(to))
                .map(s -> s.getDepartureAirport())
                .forEach(search::add);

       Set<String> allItems = new HashSet<>();
        Set<String> duplicates = search.stream()
                .filter(n -> !allItems.add(n))
                .collect(Collectors.toSet());

        String przesiadka = duplicates.toString();
        int x = przesiadka.length();
        String przesiadka2 =  przesiadka.substring(1,x-1);

        flightDestinations.entrySet().stream()
                .map(Map.Entry::getKey)
                .filter(f -> f.getDepartureAirport().equals(from))
                .filter(f -> f.getArrivalAirport().equals(przesiadka2))
                .forEach(System.out::println);

        flightDestinations.entrySet().stream()
                .map(Map.Entry::getKey)
                .filter(f -> f.getArrivalAirport().equals(to))
                .filter(f -> f.getDepartureAirport().equals(przesiadka2))
                .forEach(System.out::println);
    }

}

