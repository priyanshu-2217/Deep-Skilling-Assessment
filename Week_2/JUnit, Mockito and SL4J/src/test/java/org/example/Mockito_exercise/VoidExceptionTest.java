package src.test.java.org.example.Mockito_exercise;



import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VoidExceptionTest {
    @Test
    public void testVoidThrowsException() {
        ExternalApi mockApi = mock(ExternalApi.class);

        doThrow(new RuntimeException("Logging failed"))
                .when(mockApi).log("fail");

        assertThrows(RuntimeException.class, () -> {
            mockApi.log("fail");
        });
    }
}
