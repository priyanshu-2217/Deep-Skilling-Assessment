package src.test.java.org.example.Mockito_exercise;


import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class VoidMethodTest {

    @Test
    public void testVoidLogging() {

        Logger mockLogger = mock(Logger.class);

        mockLogger.log("Saving data...");
        verify(mockLogger).log("Saving data...");
    }
}

