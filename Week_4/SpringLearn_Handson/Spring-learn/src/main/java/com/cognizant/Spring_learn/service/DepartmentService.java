package com.cognizant.Spring_learn.service;

import com.cognizant.Spring_learn.dao.DepartmentDao;
import com.cognizant.Spring_learn.model.Department;

import java.util.List;

public class DepartmentService {
    private DepartmentDao departmentDao = new DepartmentDao();

    public List<Department> getAllDepartments() {
        return departmentDao.getAllDepartments();
    }
}
