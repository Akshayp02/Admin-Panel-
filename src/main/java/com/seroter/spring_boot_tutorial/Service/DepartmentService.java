package com.seroter.spring_boot_tutorial.Service;

import com.seroter.spring_boot_tutorial.Entity.Department;
import com.seroter.spring_boot_tutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

    public Department savDepartment(Department department);

    public List<Department> fetchDepartments();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void DeleteDepartmentByID(Long did);

    public Department updateDepartment(Long depID, Department department);

    Department findByName(String departmentName);
}
