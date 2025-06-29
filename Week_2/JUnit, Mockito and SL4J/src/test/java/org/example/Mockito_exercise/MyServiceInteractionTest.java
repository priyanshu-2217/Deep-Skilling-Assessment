package src.test.java.org.example.Mockito_exercise;


import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class MyServiceInteractionTest {
    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi).getData(); // Verifies getData was called
    }
}
