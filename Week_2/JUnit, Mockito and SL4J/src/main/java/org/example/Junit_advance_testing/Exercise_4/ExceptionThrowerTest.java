package src.main.java.org.example.Junit_advance_testing.Exercise_4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExceptionThrowerTest {

    @Test
    public void testThrowsException() {
        ExceptionThrower thrower = new ExceptionThrower();

        assertThrows(IllegalArgumentException.class, () -> {
            thrower.throwException(null);
        });
    }
}
