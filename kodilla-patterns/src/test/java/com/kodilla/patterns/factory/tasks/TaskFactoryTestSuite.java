package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);

        //Then
        Assert.assertEquals("I'm riding with my bike to school", driving.executeTask());
        Assert.assertTrue(driving.isTaskExecuted());

    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);

        //Then
        Assert.assertEquals("I'm painting my fence on blue", painting.executeTask());
        Assert.assertTrue(painting.isTaskExecuted());

    }

    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);

        //Then
        Assert.assertEquals("I'm buying 5.0 of bannanas", shopping.executeTask());
        Assert.assertTrue(shopping.isTaskExecuted());

    }

}
