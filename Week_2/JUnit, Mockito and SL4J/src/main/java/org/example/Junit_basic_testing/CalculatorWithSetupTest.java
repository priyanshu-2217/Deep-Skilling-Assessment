package src.main.java.org.example.Junit_basic_testing;
// File: CalculatorWithSetupTest.java
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorWithSetupTest {
    private Calculator calc;

    // Arrange: Setup before each test
    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Setup called");
    }

    // Teardown: Cleanup after each test
    @After
    public void tearDown() {
        System.out.println("Teardown called");
    }

    @Test
    public void testAdd() {
        // Act
        int result = calc.add(4, 1);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        int result = calc.multiply(2, 5);
        assertEquals(10, result);
    }
}
