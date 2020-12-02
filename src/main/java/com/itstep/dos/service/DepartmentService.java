package com.itstep.dos.service;

import com.itstep.dos.model.Department;

import java.util.List;

public interface DepartmentService {
    Department addDepartment(Department department);
    void deleteById(Integer id);
    Department editDepartment(Department department);
    List<Department> getAll();
}
