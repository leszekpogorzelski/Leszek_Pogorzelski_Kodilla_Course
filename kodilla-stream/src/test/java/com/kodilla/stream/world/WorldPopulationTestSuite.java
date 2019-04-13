package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldPopulationTestSuite {

    @Test
    public void worldPopulationTest(){
        //Given
        Country polska = new Country("Polska", new BigDecimal("1234567890"));
        Country niemcy = new Country("Niemcy", new BigDecimal("2345678901"));
        Country francja = new Country("Francja", new BigDecimal( "3456789012"));
        Country japonia = new Country("Japonia", new BigDecimal("4567890123"));
        Country chiny = new Country("Chiny", new BigDecimal("5678901234"));
        Country indie = new Country("Indie", new BigDecimal("6789012345"));
        Country usa = new Country("USA", new BigDecimal("7890123456"));
        Country kanada = new Country("Kanada", new BigDecimal("8901234567"));
        Country meksyk = new Country("Meksyk", new BigDecimal("9012345678"));

        Continent europa = new Continent();
        europa.addCountry(polska);
        europa.addCountry(niemcy);
        europa.addCountry(francja);

        Continent azja = new Continent();
        azja.addCountry(japonia);
        azja.addCountry(chiny);
        azja.addCountry(indie);

        Continent ameryka = new Continent();
        ameryka.addCountry(usa);
        ameryka.addCountry(kanada);
        ameryka.addCountry(meksyk);

        World world = new World();
        world.addContinent(europa);
        world.addContinent(azja);
        world.addContinent(ameryka);

        //When

        BigDecimal totalPeople = world.getWorldPopulation();

        //Then
        BigDecimal expectedSand = new BigDecimal("49876543206");
        Assert.assertEquals(expectedSand, totalPeople);

    }
}
