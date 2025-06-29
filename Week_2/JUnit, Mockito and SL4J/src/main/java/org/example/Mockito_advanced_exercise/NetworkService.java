package src.main.java.org.example.Mockito_advanced_exercise;

public class NetworkService {
    private final NetworkClient client;

    public NetworkService(NetworkClient client) {
        this.client = client;
    }

    public String connectToServer() {
        return "Connected to " + client.connect();
    }
}
