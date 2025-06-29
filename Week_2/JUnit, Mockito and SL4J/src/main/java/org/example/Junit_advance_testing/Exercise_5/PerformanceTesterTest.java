package src.main.java.org.example.Junit_advance_testing.Exercise_5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;

public class PerformanceTesterTest {

    @Test
    public void testPerformance() {
        PerformanceTester tester = new PerformanceTester();

        assertTimeout(Duration.ofMillis(200), () -> {
            tester.performTask();
        });
    }
}
