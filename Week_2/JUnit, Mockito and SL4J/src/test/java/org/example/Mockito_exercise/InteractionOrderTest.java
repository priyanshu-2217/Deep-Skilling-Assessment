package src.test.java.org.example.Mockito_exercise;



import static org.mockito.Mockito.*;

import org.example.Mockito_exercise.ExternalApi;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

public class InteractionOrderTest {
    @Test
    public void testOrder() {
        ExternalApi mockApi = mock(ExternalApi.class);

        mockApi.callA();
        mockApi.callB();

        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).callA();
        inOrder.verify(mockApi).callB();
    }
}
