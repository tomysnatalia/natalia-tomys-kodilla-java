package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog(){
        //Given
        String log = "first log";
        String log2 = "second log";
        //When
        Logger.getInstance().log(log);
        Logger.getInstance().log(log2);
        //Then
        Assert.assertEquals(log2, Logger.getInstance().getLastLog());

    }
}
