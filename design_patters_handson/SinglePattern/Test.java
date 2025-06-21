package SinglePattern;

public class Test {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        // Check if both logger instances are the same
        System.out.println("Are both logger instances the same? " + (logger1 == logger2));
    }
}
