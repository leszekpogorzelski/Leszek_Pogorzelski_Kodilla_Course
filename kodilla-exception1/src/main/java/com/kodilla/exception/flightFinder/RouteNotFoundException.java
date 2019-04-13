package com.kodilla.exception.flightFinder;

public class RouteNotFoundException extends Exception {

    public RouteNotFoundException(String message){
        super(message);
   }
}
