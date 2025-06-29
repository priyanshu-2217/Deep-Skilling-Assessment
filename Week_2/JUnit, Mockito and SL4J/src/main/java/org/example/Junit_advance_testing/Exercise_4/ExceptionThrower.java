package src.main.java.org.example.Junit_advance_testing.Exercise_4;

public class ExceptionThrower {
    public void throwException(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
    }
}
