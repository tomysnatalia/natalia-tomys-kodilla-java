package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDrivingTask () {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makesTask((TaskFactory.DrivingTask));
        boolean executionChecking = drivingTask.isTaskExecuted();
        drivingTask.executeTask();
        //Then
        Assert.assertEquals("Driving task", drivingTask.getTaskName());
        Assert.assertFalse(executionChecking);
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask () {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makesTask((TaskFactory.PaintingTask));
        boolean executionChecking = paintingTask.isTaskExecuted();
        paintingTask.executeTask();
        //Then
        Assert.assertEquals("Painting task", paintingTask.getTaskName());
        Assert.assertFalse(executionChecking);
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryShoppingTask () {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makesTask((TaskFactory.ShoppingTask));
        boolean executionChecking = shoppingTask.isTaskExecuted();
         shoppingTask.executeTask();
        //Then
        Assert.assertEquals("Shopping task", shoppingTask.getTaskName());
        Assert.assertFalse(executionChecking);
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }
}
