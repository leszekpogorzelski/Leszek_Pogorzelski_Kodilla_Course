package com.kodilla.good.patterns.flightSearch;

public class Main {

    public static void main(String[] args){

        FlightDataBase flightDataBase = new FlightDataBase();
        flightDataBase.createDataBase();
        FlightFinder flightFinder = new FlightFinder(flightDataBase.getDataBase());
        System.out.println("Wyszukuję wszystkie loty z Krakowa:\n");
        flightFinder.findAllFlightsFrom("Kraków");
        System.out.println("\nWyszukuję wszystkie loty do Berlina:\n");
        flightFinder.findAllFlightsTo("Berlin");
        System.out.println("\nWyszukuję wszystkie loty z przesiadką z Krakowa do Berlina:\n");
        flightFinder.findIndirectFlightsFromTo("Kraków", "Berlin");
    }
}
