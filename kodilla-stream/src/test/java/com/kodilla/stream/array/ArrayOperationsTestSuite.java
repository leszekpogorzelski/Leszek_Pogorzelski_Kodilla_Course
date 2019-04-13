package com.kodilla.stream.array;

import org.junit.Test;
import org.junit.Assert;



public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given

        int[] numbers = {1,4,5,7,8,9,5,7,2,1,6,7,5,4,3,4,7,8,9,1};

        //When
        double expected = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(5.15, expected, 0.1);


    }
}
