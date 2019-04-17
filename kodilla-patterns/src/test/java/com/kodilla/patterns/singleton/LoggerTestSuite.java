package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetFileName() {
        //Given
        Logger.getInstance().log("first Log");
        //When
        String logTest = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("first Log", logTest);
    }

    @Test
    public void testGetFileName2() {
        //Given
        Logger.getInstance().log("second Log");
        //When
        String logTest = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("second Log", logTest);
    }
}