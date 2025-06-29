package src.main.java.org.example.Junit_Spring_test;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name); // Exercise 7
}