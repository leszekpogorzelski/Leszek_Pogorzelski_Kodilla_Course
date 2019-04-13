package com.kodilla.exception.flightFinder;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Flight> flights = new ArrayList<>();

        //Program wyszukuje loty z Warszawy do 4 lotnisk:
        //Poznań, Gdańsk, Kraków, Rzeszów.
        //W przypadku innych miast zgłosi błąd i go obsłuży.

        Flight flight1 = new Flight("Warszawa", "Gdańsk");
        Flight flight2 = new Flight("Warszawa", "Kraków");
        Flight flight3 = new Flight("Warszawa", "Radom"); //błędne lotnisko
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);

        System.out.println("Wyszukiwarka połączeń lotniczych.\n");
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.addMap();


        for (int i = 0; i < flights.size(); i++)
            try {
                System.out.println("\nWyszukuję połączenie do: " + flights.get(i).getArrivalAirport());
                flightFinder.findFlight(flights.get(i));
                System.out.println("Znaleziono połączenie do: " + flights.get(i).getArrivalAirport() + "\n");

            } catch (RouteNotFoundException r) {
                System.out.println(r.getMessage());

            } finally {
                System.out.println("Czy chcesz wyszukac inne połączenie?");
            }

    }
}
