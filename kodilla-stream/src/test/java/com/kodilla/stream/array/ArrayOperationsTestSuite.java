package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int numbers [] = {2,2,2,2,2,2};
        double averageResult = 2;
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(averageResult,average, 0.001);
        System.out.println("average: " + average);
    }
}
