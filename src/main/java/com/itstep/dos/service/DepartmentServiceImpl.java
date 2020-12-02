package com.itstep.dos.service;

import com.itstep.dos.model.Department;
import com.itstep.dos.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department addDepartment(Department department) {
        return departmentRepository.saveAndFlush(department);
    }

    @Override
    public void deleteById(Integer id) {
        this.departmentRepository.deleteById(id);
    }

    @Override
    public Department editDepartment(Department department) {
        return departmentRepository.saveAndFlush(department);
    }

    @Override
    public List<Department> getAll() {
        return departmentRepository.findAll();
    }
}
