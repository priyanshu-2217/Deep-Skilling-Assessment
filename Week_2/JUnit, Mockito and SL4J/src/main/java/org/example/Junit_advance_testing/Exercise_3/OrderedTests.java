package src.main.java.org.example.Junit_advance_testing.Exercise_3;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(1)
    public void testA() {
        System.out.println("Running test A");
        assertTrue(true);
    }

    @Test
    @Order(2)
    public void testB() {
        System.out.println("Running test B");
        assertTrue(true);
    }

    @Test
    @Order(3)
    public void testC() {
        System.out.println("Running test C");
        assertTrue(true);
    }
}
