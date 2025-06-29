

package src.test.java.org.example.Mockito_exercise;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.example.Mockito_exercise.ExternalApi;
import org.junit.jupiter.api.Test;

public class MyServiceTest {
    @Test
    public void testExternalApi() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }
}
