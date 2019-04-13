package com.kodilla.good.patterns.flightSearch;

import java.util.HashMap;
import java.util.Map;

public class FlightDataBase {

    private static final Map<Flight, Boolean> flightDestinations = new HashMap<>();

    public FlightDataBase() {

    }

    public void createDataBase() {
        Flight flight1 = new Flight("Warszawa", "Kraków");
        Flight flight2 = new Flight("Kraków", "Poznań");
        Flight flight3 = new Flight("Warszawa", "Szczecin");
        Flight flight4 = new Flight("Kraków", "Rzeszów");
        Flight flight5 = new Flight("Kraków", "Gdańsk");
        Flight flight6 = new Flight("Gdańsk", "Berlin");
        Flight flight7 = new Flight("Warszawa", "Berlin");

        flightDestinations.put(flight1, true);
        flightDestinations.put(flight2, true);
        flightDestinations.put(flight3, true);
        flightDestinations.put(flight4, true);
        flightDestinations.put(flight5, true);
        flightDestinations.put(flight6, true);
        flightDestinations.put(flight7, true);
    }

    public final Map getDataBase() {
        return new HashMap<Flight, Boolean>(flightDestinations);
    }
}
