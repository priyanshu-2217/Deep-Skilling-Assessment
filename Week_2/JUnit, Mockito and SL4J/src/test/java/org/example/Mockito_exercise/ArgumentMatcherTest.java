package src.test.java.org.example.Mockito_exercise;



import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class ArgumentMatcherTest {
    @Test
    public void testWithMatchers() {
        List<String> mockList = mock(List.class);

        mockList.add("Mockito");

        verify(mockList).add(eq("Mockito"));     // matches exactly
        verify(mockList, never()).add(eq("JUnit")); // never called with "JUnit"
    }
}
