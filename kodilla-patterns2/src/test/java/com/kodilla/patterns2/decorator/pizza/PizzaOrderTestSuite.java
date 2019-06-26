package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithAdditionalIngredientsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new Order(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new ChilliDecorator(theOrder);
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(26),cost);
    }

    @Test
    public void testPizzaWithAdditionalIngredientsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new Order(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new ChilliDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals("ciasto + sos pomidorowy + ser + dodatkowy ser + szynka + ostra papryka",description);
    }
}
