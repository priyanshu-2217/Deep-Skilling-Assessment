package com.cognizant.Spring_learn.dao;

import com.cognizant.Spring_learn.model.Department;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DepartmentDao {
    public List<Department> getAllDepartments() {
        ApplicationContext context = new ClassPathXmlApplicationContext("department.xml");
        return context.getBean("departmentList", List.class);
    }
}
