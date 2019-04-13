package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class World {

    private final List<Continent> continentsPopulation = new ArrayList<>();

    public void addContinent(Continent continent){
        continentsPopulation.add(continent);

    }

    public BigDecimal getWorldPopulation() {
        return continentsPopulation.stream()
                .flatMap(continent -> continent.getCountriesPopulation().stream())
                .map(Country::getPeopleQuantity)
                .collect(Collectors.toList()).stream()
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

         }
}
