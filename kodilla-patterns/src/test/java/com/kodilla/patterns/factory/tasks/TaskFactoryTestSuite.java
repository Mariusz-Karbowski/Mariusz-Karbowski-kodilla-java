package com.kodilla.patterns.factory.tasks;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        shoppingTask.executeTask();
        //Then
        assertTrue(shoppingTask.isTaskExecuted());
        assertEquals("Shopping Task", shoppingTask.getTaskName());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        paintingTask.executeTask();
        //Then
        assertTrue(paintingTask.isTaskExecuted());
        assertEquals("Painting Task", paintingTask.getTaskName());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        drivingTask.executeTask();
        //Then
        assertTrue(drivingTask.isTaskExecuted());
        assertEquals("Driving Task", drivingTask.getTaskName());
    }
}
