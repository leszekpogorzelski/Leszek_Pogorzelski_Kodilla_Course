package com.kodilla.exception.flightFinder;

import java.util.HashMap;
import java.util.Map;

public final class FlightFinder  {
    private static final Map<String, Boolean> flightDestinations = new HashMap<>();

    public FlightFinder(){
    }

    public void addMap(){
        flightDestinations.put("Poznań", true);
        flightDestinations.put("Gdańsk", true);
        flightDestinations.put("Kraków", true);
        flightDestinations.put("Rzeszów", true);
    }

    public static Map<String, Boolean> flightMap() {
         return new HashMap<String, Boolean>(flightDestinations);
    }

    public Boolean findFlight(Flight flight) throws RouteNotFoundException {
                    Long tryCounter = FlightFinder.flightMap().entrySet().stream()
                    .map(Map.Entry::getKey)
                    .filter(s -> s.equals(flight.getArrivalAirport()))
                    .count();
                     if(tryCounter > 0) {
                         return true;
                     }
                     else{
                         throw new RouteNotFoundException("Niestety nie obsługujemy tego połączenia.\n");
                     }
    }
}