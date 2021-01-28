package com.kodilla.patterns.singleton;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLog() {
        //Given
        Logger loggerInstance = Logger.INSTANCE;
        loggerInstance.log("read");
        loggerInstance.log("write");
        //When
        String lastLog = loggerInstance.getLastLog();
        //Then
        assertEquals("write", lastLog);
    }
}
