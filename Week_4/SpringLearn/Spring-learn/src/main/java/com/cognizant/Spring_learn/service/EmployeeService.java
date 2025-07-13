package com.cognizant.Spring_learn.service;

import com.cognizant.Spring_learn.dao.EmployeeDao;
import com.cognizant.Spring_learn.model.Employee;
import java.util.List;

public class EmployeeService {
    private final EmployeeDao employeeDao = new EmployeeDao();

    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }

    public Employee updateEmployee(Employee updated) {
        List<Employee> employees = employeeDao.getAllEmployees();
        for (Employee emp : employees) {
            if (emp.getId() == updated.getId()) {
                emp.setName(updated.getName());
                emp.setDepartment(updated.getDepartment());
                emp.setSkills(updated.getSkills());
                return emp;
            }
        }
        return null; // or throw exception
    }

    public void deleteEmployee(int id) {
        List<Employee> employees = employeeDao.getAllEmployees();
        employees.removeIf(emp -> emp.getId() == id);
    }
}
