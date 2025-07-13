package com.cognizant.JWT_Handson.Controller;

import com.cognizant.JWT_Handson.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return List.of(
                new Employee(1, "John"),
                new Employee(2, "Alice")
        );
    }
}

