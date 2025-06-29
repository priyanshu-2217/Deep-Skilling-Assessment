package src.test.java.Junit_Spring_test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class UserTests {

    @Autowired private MockMvc mockMvc;
    @Autowired private UserService userService;

    @MockBean private UserRepository userRepository;

    // Exercise 1: Basic unit test
    @Test void testAdd() {
        assertEquals(5, userService.add(2, 3));
    }

    // Exercise 2: Mock repo
    @Test void testGetUserById() {
        User u = new User(); u.setId(1L); u.setName("John");
        when(userRepository.findById(1L)).thenReturn(java.util.Optional.of(u));
        assertEquals("John", userService.getUserById(1L).getName());
    }

    // Exercise 3: MockMvc GET
    @Test void testGetUserEndpoint() throws Exception {
        User u = new User(); u.setId(1L); u.setName("John");
        when(userRepository.findById(1L)).thenReturn(java.util.Optional.of(u));
        mockMvc.perform(get("/users/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("John"));
    }

    // Exercise 4: Full integration is covered by this MockMvc + context

    // Exercise 5: POST test
    @Test void testCreateUser() throws Exception {
        User u = new User(); u.setId(1L); u.setName("John");
        when(userRepository.save(any(User.class))).thenReturn(u);
        mockMvc.perform(post("/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"id\":1,\"name\":\"John\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("John"));
    }

    // Exercise 6: Exception
    @Test void testMissingUserThrowsException() {
        when(userRepository.findById(99L)).thenReturn(java.util.Optional.empty());
        assertThrows(NoSuchElementException.class, () -> userService.getUserById(99L));
    }

    // Exercise 7: Custom query
    @Test void testFindByName() {
        userService.findByName("John");
        verify(userRepository).findByName("John");
    }

    // Exercise 8: Global handler
    @Test void testGlobalExceptionHandler() throws Exception {
        when(userRepository.findById(999L)).thenReturn(java.util.Optional.empty());
        mockMvc.perform(get("/users/999"))
                .andExpect(status().isNotFound())
                .andExpect(content().string("User not found"));
    }

    // Exercise 9: Parameterized
    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5})
    void testParameterizedAdd(int val) {
        assertTrue(userService.add(val, 1) > val);
    }
}
