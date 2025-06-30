package mock_dependency;


import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@WebMvcTest(src.main.java.org.example.Mockito_mockdependencies.UserController.class)
public class UserControllerTest {

    @Autowired private MockMvc mockMvc;

    @MockBean private UserService userService;

    @Test
    void testGetUserWithMockedService() throws Exception {
        User u = new User(); u.setId(1L); u.setName("Mock User");
        when(userService.getUserById(1L)).thenReturn(u);

        mockMvc.perform(get("/users/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Mock User"));
    }
}
 class UserControllerTest {
}
