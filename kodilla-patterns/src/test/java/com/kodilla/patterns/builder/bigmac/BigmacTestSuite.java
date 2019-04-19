package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
          @Test
        public void testNewBigMac() {
            //Given
            BigMac bigmac = new BigMac.BigMacBuilder()
                    .bun("BUNWITHSESAME")
                    .burgers("WELLDONEBURGER")
                    .ingredient("ONION")
                    .sauce("STANDARDSAUCE")
                    .ingredient("CUCUMBER")
                    .ingredient("SHRIMPS")
                    .ingredient("MUSHROOMS")
                    .build();
            System.out.println(bigmac);
            //When
            int howManyIngredients = bigmac.getIngredients().size();
            //Then
            Assert.assertEquals(4, howManyIngredients);
        }

    @Test
    public void testNewBigMac1() {
        //Given
        try {
            BigMac bigmac = new BigMac.BigMacBuilder()
                    .bun("BUNWITHSESAME")
                    .burgers("WELLDONEBURGER")
                    .ingredient("ONIO")
                    .sauce("STANDARDSAUCE")
                    .ingredient("CUCUMBER")
                    .ingredient("SHRIMPS")
                    .ingredient("MUSHROOMS")
                    .build();
        } catch (IllegalStateException i) {
            System.out.println(i);
        }

    }
}
