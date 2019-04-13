package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Continent {
    private final List<Country> countriesPopulation = new ArrayList<>();

    public void addCountry(Country country){
        countriesPopulation.add(country);

    }
    public List<Country> getCountriesPopulation(){
        return countriesPopulation;
    }


}
