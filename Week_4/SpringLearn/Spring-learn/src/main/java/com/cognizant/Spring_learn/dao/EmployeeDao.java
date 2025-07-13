package com.cognizant.Spring_learn.dao;

import com.cognizant.Spring_learn.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class EmployeeDao {
    public List<Employee> getAllEmployees() {
        ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
        return context.getBean("employeeList", List.class);
    }
}
