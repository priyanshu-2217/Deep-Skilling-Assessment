package src.main.java.org.example.Junit_Spring_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public int add(int a, int b) { return a + b; } // Exercise 1

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new); // Ex 2, 6
    }

    public User saveUser(User user) { return userRepository.save(user); }

    public List<User> findByName(String name) { return userRepository.findByName(name); }
}