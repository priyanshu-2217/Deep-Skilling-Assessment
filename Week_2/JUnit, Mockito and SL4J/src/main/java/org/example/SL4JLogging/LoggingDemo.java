package src.main.java.org.example.SL4JLogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {
    private static final Logger logger = LoggerFactory.getLogger(LoggingDemo.class);

    public static void main(String[] args) {
        // Exercise 1: Error and Warning Messages
        logger.error("Error occurred while processing request");
        logger.warn("Low memory warning");

        // Exercise 2: Parameterized Logging
        String user = "Priyanshu";
        int age = 22;
        logger.info("User {} is {} years old", user, age);

        // Exercise 3: Log outputs to both console and file (configured via logback.xml)
        logger.debug("Debugging application setup");
    }
}
