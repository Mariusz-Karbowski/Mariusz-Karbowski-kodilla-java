package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        int numbers [] = {0, 1, 3, 4, 5, 7, 8, 9, 11, 10, 13, 14, 15};
        double expectedAverage = 7.6923;
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(expectedAverage, average, 0.0001);
        System.out.println("Average: " + average);
    }
}