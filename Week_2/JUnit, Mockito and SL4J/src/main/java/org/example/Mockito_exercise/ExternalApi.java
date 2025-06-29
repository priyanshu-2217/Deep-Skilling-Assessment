package src.main.java.org.example.Mockito_exercise;


public class ExternalApi {
    public String getData() {
        return "Real Data";
    }

    public void log(String message) {
        System.out.println("Logged: " + message);
    }

    public void callA() {}
    public void callB() {}
}
