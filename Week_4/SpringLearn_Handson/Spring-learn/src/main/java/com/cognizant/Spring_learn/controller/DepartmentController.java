package com.cognizant.Spring_learn.controller;

import com.cognizant.Spring_learn.model.Department;
import com.cognizant.Spring_learn.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    private DepartmentService departmentService = new DepartmentService();

    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }
}
